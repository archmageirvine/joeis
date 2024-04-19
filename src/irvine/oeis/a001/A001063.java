package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A001063 E.g.f. satisfies A'(x) = A(x/(1-x)).
 * @author Sean A. Irvine
 */
public class A001063 extends MemorySequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      final Z fn = Functions.FACTORIAL.z(n - 1);
      for (int k = 0; k < n; ++k) {
        s = s.add(fn.divide(Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(n - 2, k - 1)).multiply(a(k)));
      }
      return s;
    }
  }
}
