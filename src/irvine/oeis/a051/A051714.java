package irvine.oeis.a051;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051714 Numerators of table a(n,k) read by antidiagonals: a(0,k) = 1/(k+1), a(n+1,k) = (k+1)*(a(n,k) - a(n,k+1)), n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051714 extends MemoryFunction2Sequence<Long, Q> {

  private long mN = -1;
  private long mM = -1;

  @Override
  protected Q compute(final Long n, final Long m) {
    if (n == 0) {
      return new Q(1, m + 1);
    }
    return get(n - 1, m).subtract(get(n - 1, m + 1)).multiply(m + 1);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(get(mM, mN - mM));
  }
}
