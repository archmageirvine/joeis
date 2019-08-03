package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025012.
 * @author Sean A. Irvine
 */
public class A025012 implements Sequence {

  private static final Z Z41 = Z.valueOf(41);
  private static final Z Z383 = Z.valueOf(383);
  private static final Z Z83 = Z.valueOf(83);
  private static final Z Z199 = Z.valueOf(199);
  private static final Z Z43 = Z.valueOf(43);
  private final Z[] mA = {Z.ONE, Z.ONE, Z.SEVEN, Z.valueOf(37), Z.valueOf(231), Z.valueOf(1451), Z.valueOf(9331)};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[(int) mN];
    }
    final Z a6 = mA[6].multiply(Z41.multiply(mN).subtract(723).multiply(mN).add(1132).multiply(mN).subtract(456));
    final Z a5 = mA[5].multiply(Z383.multiply(mN).subtract(2607).multiply(mN).add(5992).multiply(mN).subtract(4608)).multiply(7);
    final Z a4 = mA[4].multiply(Z83.multiply(mN).subtract(1317).multiply(mN).add(6706).multiply(mN).subtract(10512)).multiply(49);
    final Z a3 = mA[3].multiply(Z199.multiply(mN).subtract(2487).multiply(mN).add(10394).multiply(mN).subtract(14496)).multiply(343);
    final Z a2 = mA[2].multiply(Z43.multiply(mN).subtract(437).multiply(mN).add(1116)).multiply(mN - 4).multiply(2401);
    final Z a1 = mA[1].multiply(5 * mN - 24).multiply(mN - 5).multiply(mN - 4).multiply(16807);
    final Z a0 = mA[0].multiply(mN - 4).multiply(mN - 5).multiply(mN - 6).multiply(117649);
    final Z u = a0.add(a1).subtract(a2).subtract(a3).add(a4).add(a5).subtract(a6);
    final Z t = u.divide(3).divide(mN).divide(3 * mN - 1).divide(3 * mN - 2);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = t;
    return t;
  }
}
