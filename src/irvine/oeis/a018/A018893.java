package irvine.oeis.a018;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A018893 Blasius sequence: from coefficients in expansion of solution to Blasius's equation in boundary layer theory.
 * @author Sean A. Irvine
 */
public class A018893 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long u = 3L * n - 1;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(u, 3L * k).multiply(a(k)).multiply(a(n - k - 1)));
    }
    return sum;
  }
}

