package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030033 <code>a(n+1) = Sum_{k = 0..floor(2*n/3)} a(k)*a(n-k)</code> for <code>n &gt;= 0</code> with <code>a(0) = 1</code>.
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
      sum = sum.add(get(k).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
