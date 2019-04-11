package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007579 Number of Young tableaux of height <code>&lt;= 6</code>.
 * @author Sean A. Irvine
 */
public class A007579 implements Sequence {

  // After Alois P. Heinz

  private static final Z Z20 = Z.valueOf(20);

  private Z[] mA = {Z.ONE, Z.ONE, Z.TWO, Z.FOUR};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[mN];
    }
    final Z a3 = mA[3].multiply(Z20.multiply(mN).add(184).multiply(mN).add(336));
    final Z a2 = mA[2].multiply(Z.TEN.multiply(mN).add(58).multiply(mN).add(33)).multiply(mN - 1).multiply(4);
    final Z a1 = mA[1].multiply(mN - 2).multiply(mN - 1).multiply(144);
    final Z a0 = mA[0].multiply(mN - 3).multiply(mN - 2).multiply(mN - 1).multiply(144);
    final Z t = a3.add(a2).subtract(a1).subtract(a0).divide(mN + 5).divide(mN + 8).divide(mN + 9);
    mA[0] = mA[1];
    mA[1] = mA[2];
    mA[2] = mA[3];
    mA[3] = t;
    return t;
  }
}
