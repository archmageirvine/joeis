package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022857 <code>a(n) = [ a(n-1)/a(1) + a(n-2)/a(2) +</code> ... <code>+ a(1)/a(n-1) ]</code>, for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A022857 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    for (int k = 0; k < n; k++) {
      sum = sum.add(new Q(get(n - k - 1), get(k)));
    }
    return sum.toZ();
  }
}
