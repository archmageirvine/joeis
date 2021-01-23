package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005119 Infinitesimal generator of x*(x + 1).
 * @author Sean A. Irvine
 */
public class A005119 extends MemorySequence {

  private MemoryFactorial mF = new MemoryFactorial();

  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    if (n == 1) {
      return Z.ONE;
    }
    final Z f = mF.factorial(n - 2);
    Z s = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      s = s.signedAdd((k & 1) == 1, f.multiply(Binomial.binomial(n - k + 1, k + 1)).multiply(get(n - k - 1)).divide(mF.factorial(n - k - 1)));
    }
    return s;
  }
}

