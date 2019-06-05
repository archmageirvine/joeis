package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023426 Generalized Catalan Numbers.
 * @author Sean A. Irvine
 */
public class A023426 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1);
    for (int k = 0; k <= n - 4; ++k) {
      sum = sum.add(get(k).multiply(get(n - 4 - k)));
    }
    return sum;
  }
}
