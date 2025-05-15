package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007852 Number of antichains in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007852 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long t = 2 * mN - 1;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * k + 1, k).multiply(Binomial.binomial(t, mN - k - 1)));
    }
    return sum.divide(t);
  }
}
