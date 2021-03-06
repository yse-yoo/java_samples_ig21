package rpg;

import java.util.Random;

public class Character {
	//初期化ブロック（インスタンス生成前）
	{
		System.out.println("初期化ブロック");
		this.level = 1;
	}

	//コンストラクタ
	public Character(String name, String job) {
		//自分の親クラス（Objecgクラス）のコンストラクタを実行
		super();
		System.out.println("キャラクタ生成");

		this.name = name;
		this.job = job;
		this.hp = 50;
	}

	//フィールド
	//キャラクター名
	public String name;

	//職業
	public String job;

	//体力
	public int hp;
	
	//レベル
	public int level;


	//インスタンスメソッド
	//歩く
	public void walk(String direction) {
		String message = this.name + " move " + direction;
		System.out.println(message);
	}
	
	//話す
	public void talk(Character character, String message) {
		message = character.name + "!" + message;
		System.out.println(message);
	}
	
	//攻撃する
	public void attack(Character character) {
		Random random = new Random();
		int damage = random.nextInt(8);

//		int damage = 1;
		//相手のHPを減らす
		character.hp -= damage;
	}
	
}
