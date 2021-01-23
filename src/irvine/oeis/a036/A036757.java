package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036757 Number of tree-like heptagonal systems.
 * @author Sean A. Irvine
 */
public class A036757 implements Sequence {

  private static final Z C1 = Z.valueOf(713264163292482871L);
  private static final Z C2 = Z.valueOf(-152996351532211558L);
  private static final Z C3 = Z.valueOf(-1342943576342180377L);
  private static final Z C3B = new Z("13914387232583975999");
  private static final Z C4 = Z.valueOf(1176000173357559779L);
  private static final Z C4B = new Z("12080777098370225883");
  private static final Z C4C = new Z("41059366674368812519");
  private static final Z C4D = new Z("46837520282616567774");
  private static final Z C5 = Z.valueOf(48936490024662023L);
  private static final Z C5B = new Z("45578929167175613951");
  private static final Z C5C = new Z("116638160879966581764");
  private static final Z C6 = Z.valueOf(-159177372154375949L);
  private static final Z C7 = Z.valueOf(74884092893861221L);
  private static final Z C8 = Z.valueOf(2002828774404026L);
  private static final Z C9 = Z.valueOf(362527389538506L);
  private static final Z D = Z.valueOf(37333940645327033L);
  private final Z[] mA = {Z.ONE, Z.ONE, Z.TWO, Z.SEVEN, Z.valueOf(26), Z.valueOf(126), Z.valueOf(640), Z.valueOf(3559), Z.valueOf(20366)};
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= mA.length) {
      return mA[mN - 1];
    }
    final Z t1 = C1.multiply(mN).subtract(2924046469427413489L).multiply(mN).add(1162756152416330286L).multiply(mN + 1).multiply(mA[8]);
    final Z t2 = C2.multiply(mN).add(1720662676274714640L).multiply(mN).subtract(2533776489355639049L).multiply(mN).subtract(59123194190660862L).multiply(mA[7]).multiply(4);
    final Z t3 = C3.multiply(mN).add(7608046315696084062L).multiply(mN).subtract(C3B).multiply(mN).add(9124977747699642762L).multiply(mA[6]).multiply(4);
    final Z t4 = C4.multiply(mN).subtract(C4B).multiply(mN).add(C4C).multiply(mN).subtract(C4D).multiply(mA[5]).multiply(8);
    final Z t5 = C5.multiply(mN).add(4102665980343195888L).multiply(mN).subtract(C5B).multiply(mN).add(C5C).multiply(mA[4]).multiply(4);
    final Z t6 = C6.multiply(mN).add(1844748442783980714L).multiply(mN).subtract(4261065176440884304L).multiply(mN).subtract(6098129046823314687L).multiply(mA[3]).multiply(32);
    final Z t7 = C7.multiply(mN).subtract(1252855905292173702L).multiply(mN).add(6404002902490756322L).multiply(mN).subtract(8555019969894216645L).multiply(mA[2]).multiply(16);
    final Z t8 = C8.multiply(mN).add(53787805034972963L).multiply(mN).subtract(566190782987287023L).multiply(mA[1]).multiply(mN - 10).multiply(64);
    final Z t9 = C9.multiply(mN).subtract(7714335008857429L).multiply(mA[0]).multiply(mN - 10).multiply(mN - 11).multiply(192);
    final Z d = D.multiply(mN).subtract(118246388381321724L).multiply(mN + 2).multiply(mN + 1).multiply2();
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[8] = t1.add(t2).add(t3).add(t4).add(t5).add(t6).add(t7).add(t8).add(t9).divide(d);
    return mA[8];
  }
}
