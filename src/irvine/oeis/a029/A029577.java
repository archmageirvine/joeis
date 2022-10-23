package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029577 Number of permutations of an n-set containing a 10-cycle.
 * @author Sean A. Irvine
 */
public class A029577 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    Z f = mF;
    for (long k = 0; k <= mN / 10; ++k) {
      if (k > 0) {
        f = f.divide(10 * k);
      }
      sum = sum.signedAdd((k & 1) == 0, f);
    }
    return mF.subtract(sum);
  }
}
