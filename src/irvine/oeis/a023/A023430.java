package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A023430 Generalized Catalan Numbers x^4*A(x)^2 -(1-x+x^4+x^5+x^6+x^7)*A(x) + 1 =0.
 * @author Sean A. Irvine
 */
public class A023430 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 4; k <= n - 4; ++k) {
      sum = sum.add(a(k).multiply(a(n - 4 - k)));
    }
    return sum;
  }
}
