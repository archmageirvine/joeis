package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005119 Infinitesimal generator of x*(x + 1).
 * @author Sean A. Irvine
 */
public class A005119 extends MemorySequence {

  {
    setOffset(1);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    if (n == 1) {
      return Z.ONE;
    }
    final Z f = Functions.FACTORIAL.z(n - 2);
    Z s = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      s = s.signedAdd((k & 1) == 1, f.multiply(Binomial.binomial(n - k + 1, k + 1)).multiply(a(n - k - 1)).divide(Functions.FACTORIAL.z(n - k - 1)));
    }
    return s;
  }
}

