package irvine.oeis.a026;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A026637 Triangular array T read by rows: T(n,0)=T(n,n)=1 for n &gt;= 0; T(n,1)=T(n,n-1)=[ (3n-1)/2 ] for n &gt;= 1; T(n,k)=T(n-1,k-1)+T(n-1,k) for 2&lt;=k&lt;=n-2, n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A026637 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if (m == 1 || m == n - 1) {
      return Z.valueOf((3 * n - 1) / 2);
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
