package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023423 Generalized Catalan Numbers.
 * @author Sean A. Irvine
 */
public class A023423 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1);
    for (int k = 5; k <= n - 2; ++k) {
      sum = sum.add(get(k).multiply(get(n - 2 - k)));
    }
    return sum;
  }
}
