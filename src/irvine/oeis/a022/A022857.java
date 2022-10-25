package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022857 a(n) = [ a(n-1)/a(1) + a(n-2)/a(2) + ... + a(1)/a(n-1) ], for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A022857 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    for (int k = 0; k < n; k++) {
      sum = sum.add(new Q(a(n - k - 1), a(k)));
    }
    return sum.toZ();
  }
}
