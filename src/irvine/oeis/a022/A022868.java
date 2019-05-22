package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022868 <code>a(n) = [ a(n-1)/a(1) ] + [ a(n-1)/a(2) ] +</code> ... <code>+ [ a(n-1)/a(n-1) ]</code> for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A022868 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    final Z num = get(n - 1);
    for (final Z a : this) {
      sum = sum.add(num.divide(a));
    }
    return sum;
  }
}
