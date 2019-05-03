package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007382 Number of strict <code>(-1)st-order</code> maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007382 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k + 1, k));
    }
    return sum;
  }
}
