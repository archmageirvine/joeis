package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030018 Coefficients in 1/(1+P(x)), where P(x) is the generating function of the primes.
 * @author Sean A. Irvine
 */
public class A030018 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.subtract(Functions.PRIME.z(n - k).multiply(a(k)));
    }
    return sum;
  }
}
