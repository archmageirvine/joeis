package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022861 <code>a(n) = [ a(n-1)/a(1) + a(n-1)/a(2) +</code> ... <code>+ a(n-1)/a(n-1) ]</code> for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A022861 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 0 ? Z.ONE : Z.TWO;
    }
    Q sum = Q.ZERO;
    final Z num = get(n - 1);
    for (final Z a : this) {
      sum = sum.add(new Q(num, a));
    }
    return sum.toZ();
  }
}
