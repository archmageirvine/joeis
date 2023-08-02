package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007043 Number of noncommutative SL(2,C)-invariants of degree n in 5 variables.
 * @author Sean A. Irvine
 */
public class A007043 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }
    final Z t = mC.multiply(19L * mN - 20).multiply(3L * mN - 2).multiply(mN - 1)
      .add(mB.multiply(3L * mN - 5).multiply(mN).multiply(10L * mN - 10))
      .subtract(mA.multiply(3L * mN - 2).multiply(mN - 1).multiply(mN - 2).multiply(25))
      .divide(3L * mN - 5).divide(2L * mN + 1).divide(2L * mN);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
