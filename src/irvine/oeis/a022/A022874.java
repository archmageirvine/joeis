package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022874 a(n) = [ a(n-1)/a(1) ] + [ a(n-1)/a(2) ] + ... + [ a(n-1)/a(n-1) ] for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A022874 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 1 ? Z.ONE : Z.TWO;
    }
    Z sum = Z.ZERO;
    final Z num = get(n - 1);
    for (final Z a : this) {
      sum = sum.add(num.divide(a));
    }
    return sum;
  }
}
