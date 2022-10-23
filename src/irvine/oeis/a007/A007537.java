package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007537 Number of proper covers of an n-set.
 * @author Sean A. Irvine
 */
public class A007537 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).shiftLeft(1 << (mN - k)));
    }
    return sum.divide2().subtract(Z.ONE.shiftLeft((1 << mN) - 2));
  }
}
