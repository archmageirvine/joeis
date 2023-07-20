package irvine.oeis.a045;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045545 a(0) = 1; a(n) = Sum_{0 &lt;= k &lt; n and gcd(k,n) = 1} a(k).
 * @author Sean A. Irvine
 */
public class A045545 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      if (LongUtils.gcd(k, n) == 1) {
        sum = sum.add(a(k));
      }
    }
    return sum;
  }
}
