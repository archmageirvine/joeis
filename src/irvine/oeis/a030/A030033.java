package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030033 a(n+1) = Sum_{k = 0..floor(2*n/3)} a(k)*a(n-k) for n &gt;= 0 with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A030033 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * (n - 1) / 3; ++k) {
      sum = sum.add(a(k).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
