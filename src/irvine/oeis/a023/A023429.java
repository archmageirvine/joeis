package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A023429 Generalized Catalan Numbers.
 * @author Sean A. Irvine
 */
public class A023429 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 3; k <= n - 4; ++k) {
      sum = sum.add(a(k).multiply(a(n - 4 - k)));
    }
    return sum;
  }
}
