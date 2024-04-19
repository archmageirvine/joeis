package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A028342 Expansion of Product_{i&gt;=1} (1 - x^i)^(-1/i); also of exp(Sum_{n&gt;=1} (d(n)*x^n/n)) where d is number of divisors function.
 * @author Sean A. Irvine
 */
public class A028342 extends MemorySequence {


  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Z f = Functions.FACTORIAL.z(n - 1);
    for (int k = 0; k < n; ++k) {
      sum = sum.add(f.multiply(Functions.SIGMA0.z(k + 1)).multiply(a(n - k - 1)).divide(Functions.FACTORIAL.z(n - k - 1)));
    }
    return sum;
  }
}
