package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A022873 a(n) = [ a(n-1)/a(1) + a(n-1)/a(2) + ... + a(n-1)/a(n-1) ] for n &gt;= 3, with initial terms 2,1.
 * @author Sean A. Irvine
 */
public class A022873 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 1 ? Z.ONE : Z.TWO;
    }
    Q sum = Q.ZERO;
    final Z num = a(n - 1);
    for (final Z a : this) {
      sum = sum.add(new Q(num, a));
    }
    return sum.toZ();
  }
}
