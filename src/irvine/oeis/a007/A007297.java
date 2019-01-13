package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007297.
 * @author Sean A. Irvine
 */
public class A007297 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(3 * mN, mN - k - 1).multiply(Binomial.binomial(mN + k - 1, k)));
    }
    return sum.divide(mN);
  }
}
