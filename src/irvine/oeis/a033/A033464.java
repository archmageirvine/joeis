package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A033464 Logarithmic (or "LOG") transform of squares A000290.
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
      sum = sum.add(Binomial.binomial(n, k).multiply(k).multiply(Z.valueOf(n - k).square()).multiply(a(k)));
    }
    return Z.valueOf(n).square().subtract(sum.divide(n));
  }
}
