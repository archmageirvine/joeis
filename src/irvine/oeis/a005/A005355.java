package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

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
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    if ((n & 1) == 1) {
      sum = sum.subtract(get(n / 2));
    }
    return sum;
  }
}

