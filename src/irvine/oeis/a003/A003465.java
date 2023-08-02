package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003465 Number of ways to cover an n-set.
 * @author Sean A. Irvine
 */
public class A003465 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 32) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).shiftLeft(1L << (mN - k)));
    }
    return sum.divide2();
  }
}
