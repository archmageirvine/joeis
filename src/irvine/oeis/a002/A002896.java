package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002896 Number of 2n-step polygons on cubic lattice.
 * @author Sean A. Irvine
 */
public class A002896 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z n2 = Z.valueOf(mN).square();
      final Z t = mB.multiply2().multiply(2 * mN - 1).multiply(n2.multiply(10).subtract(10 * mN - 3))
        .subtract(mA.multiply(36).multiply(mN - 1).multiply(2 * mN - 1).multiply(2 * mN - 3))
        .divide(n2.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
