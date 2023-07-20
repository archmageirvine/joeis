package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A022877 a(n) = floor( a(n-1)/a(1) + a(n-3)/a(3) + a(n-5)/a(5) + ... ), for n &gt;= 3 with a(1) = 1 and a(2) = 3.
 * @author Sean A. Irvine
 */
public class A022877 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 0 ? Z.ONE : Z.THREE;
    }
    Q sum = Q.ZERO;
    for (int k = 0; k < n; k += 2) {
      sum = sum.add(new Q(a(n - k - 1), a(k)));
    }
    return sum.toZ();
  }
}
