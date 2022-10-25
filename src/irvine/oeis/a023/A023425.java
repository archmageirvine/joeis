package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023425 Generalized Catalan numbers: a(0) = 1, a(n) = a(n-1) + Sum_{k=1..n-4} a(k) * a(n-k).
 * @author Sean A. Irvine
 */
public class A023425 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 1; k <= n - 4; ++k) {
      sum = sum.add(a(k).multiply(a(n - k)));
    }
    return sum;
  }
}
