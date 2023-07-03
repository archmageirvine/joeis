package irvine.oeis.a027;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A027113 Triangular array T given by rows: T(n,0)=1 for n &gt;= 0, T(n,1)=1,T(n,2)=2 for n &gt;= 1 and for n &gt;= 2, T(n,k)=T(n-1,k-3)+T(n-1,k-2)+T(n-1,k-1) for 3&lt;=k&lt;=2n-1, T(n,2n)=T(n-1,2n-3)+T(n-1,2n-2).
 * @author Sean A. Irvine
 */
public class A027113 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (m <= 1) {
      return Z.ONE;
    }
    if (m == 2) {
      return Z.TWO;
    }
    if (m == 2 * n) {
      return get(n - 1, 2 * n - 3).add(get(n - 1, 2 * n - 2));
    }
    return get(n - 1, m - 3).add(get(n - 1, m - 2)).add(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
