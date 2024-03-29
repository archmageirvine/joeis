package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A023432 Number of Dyck n-paths with ascents and descents of length equal to 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A023432 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = 1; k <= n - 3; ++k) {
      sum = sum.add(a(k).multiply(a(n - 3 - k)));
    }
    return sum;
  }
}
