package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023358.
 * @author Sean A. Irvine
 */
public class A023358 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k * k * k <= n; ++k) {
      sum = sum.add(get(n - k * k * k));
    }
    return sum;
  }
}
