package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A023421 Generalized Catalan Numbers x^2*A(x)^2 -(1-x+x^2+x^3+x^4)*A(x) + 1 =0.
 * @author Sean A. Irvine
 */
public class A023421 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 3; k <= n - 2; ++k) {
      sum = sum.add(a(k).multiply(a(n - 2 - k)));
    }
    return sum;
  }
}
