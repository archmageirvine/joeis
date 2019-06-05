package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023425 Generalized Catalan numbers: <code>a(0) = 1, a(n) = a(n-1) + Sum_{k=1..n-4} a(k) * a(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A023425 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1);
    for (int k = 1; k <= n - 4; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}
