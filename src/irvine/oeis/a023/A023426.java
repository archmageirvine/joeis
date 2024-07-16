package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A023426 a(n) = a(n-1) + Sum_{k=0..n-4} a(k)*a(n-4-k), a(0) = 1. Generalized Catalan Numbers.
 * @author Sean A. Irvine
 */
public class A023426 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 0; k <= n - 4; ++k) {
      sum = sum.add(a(k).multiply(a(n - 4 - k)));
    }
    return sum;
  }
}
