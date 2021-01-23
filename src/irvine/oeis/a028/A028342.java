package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A028342 Expansion of Product_{i&gt;=1} (1 - x^i)^(-1/i); also of exp(Sum_{n&gt;=1} (d(n)*x^n/n)) where d is number of divisors function.
 * @author Sean A. Irvine
 */
public class A028342 extends MemorySequence {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Z f = mF.factorial(n - 1);
    for (int k = 0; k < n; ++k) {
      sum = sum.add(f.multiply(Cheetah.factor(k + 1).sigma0()).multiply(get(n - k - 1)).divide(mF.factorial(n - k - 1)));
    }
    return sum;
  }
}
