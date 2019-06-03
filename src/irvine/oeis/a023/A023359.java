package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023359 Number of compositions (ordered partitions) of n into powers of 2.
 * @author Sean A. Irvine
 */
public class A023359 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; 1 << k <= n; ++k) {
      sum = sum.add(get(n - (1 << k)));
    }
    return sum;
  }
}
