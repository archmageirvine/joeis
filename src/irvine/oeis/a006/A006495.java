package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006495 Real part of (1 + 2*i)^n, where i is sqrt(-1).
 * @author Sean A. Irvine
 */
public class A006495 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    final int n = size();
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(a(k - 1).multiply(a(n - k)));
    }
    return a(n - 1).multiply(4 * n + 5).subtract(sum.multiply(8));
  }
}

