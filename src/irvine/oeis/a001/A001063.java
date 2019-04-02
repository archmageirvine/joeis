package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.MemorySequence;

/**
 * A001063 E.g.f. satisfies A'(x) = A(x/(1-x)).
 * @author Sean A. Irvine
 */
public class A001063 extends MemorySequence {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      final Z fn = mF.factorial(n - 1);
      for (int k = 0; k < n; ++k) {
        s = s.add(fn.divide(mF.factorial(k)).multiply(Binomial.binomial(n - 2, k - 1)).multiply(get(k)));
      }
      return s;
    }
  }
}
