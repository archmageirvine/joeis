package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a005.A005092;

/**
 * A007000 Number of partitions of n into Fibonacci parts (with 2 types of <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A007000 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final A005092 seq = new A005092();
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(seq.next().add(1).multiply(get(n - k)));
    }
    return sum.divide(n);
  }
}
