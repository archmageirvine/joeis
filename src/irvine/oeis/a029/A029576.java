package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029576 Number of permutations of an n-set containing a 9-cycle.
 * @author Sean A. Irvine
 */
public class A029576 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    Z f = mF;
    for (long k = 0; k <= mN / 9; ++k) {
      if (k > 0) {
        f = f.divide(9 * k);
      }
      sum = sum.signedAdd((k & 1) == 0, f);
    }
    return mF.subtract(sum);
  }
}
