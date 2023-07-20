package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005355 Number of asymmetric permutation rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005355 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.valueOf(n);
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(a(k).multiply(a(n - k)));
    }
    if ((n & 1) == 1) {
      sum = sum.subtract(a(n / 2));
    }
    return sum;
  }
}

