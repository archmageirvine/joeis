package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033464 Logarithmic (or <code>"LOG")</code> transform of squares <code>A000290</code>.
 * @author Sean A. Irvine
 */
public class A033464 extends MemorySequence {

  {
    next();
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(k).multiply(Z.valueOf(n - k).square()).multiply(get(k)));
    }
    return Z.valueOf(n).square().subtract(sum.divide(n));
  }
}
