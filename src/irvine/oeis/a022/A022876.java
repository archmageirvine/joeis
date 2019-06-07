package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022876 <code>a(n) = [ a(n-1)/a(1) ] + [ a(n-2)/a(2) ] + ... + [ a(1)/a(n-1) ]</code>, for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A022876 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 1 ? Z.ONE : Z.TWO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; k++) {
      sum = sum.add(get(n - k - 1).divide(get(k)));
    }
    return sum;
  }
}
