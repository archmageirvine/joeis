package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005415 Number of simple tensors with n external gluons.
 * @author Sean A. Irvine
 */
public class A005415 extends MemorySequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private Z alphaBar(final int r) {
    if (r == 1) {
      return Z.ZERO;
    }
    if (r == 2) {
      return Z.ONE;
    }
    return mF.factorial(2 * r - 4).divide(mF.factorial(r - 2));
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k).multiply(a(k)).multiply(alphaBar(n - k)));
    }
    return sum;
  }
}
