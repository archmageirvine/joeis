package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022860 a(n) = [ a(n-1)/a(1) ] + [ a(n-3)/a(3) ] + [ a(n-5)/a(5) ] + ..., for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A022860 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; k += 2) {
      sum = sum.add(get(n - k - 1).divide(get(k)));
    }
    return sum;
  }
}
