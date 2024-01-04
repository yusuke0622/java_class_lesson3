public class MagicFighter extends Fighter {
    
    public int mp;
    
    MagicFighter() {
        this.name = "魔法戦士";
        this.mp = 20;
    }
    
    void attack() {
        System.out.println(this.name + "の魔法攻撃!");
        System.out.println("敵に" + (this.atk + this.mp) + "のダメージ!");
    }
}