package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026670 Triangular array T read by rows: <code>T(n,0) = T(n,n) = 1</code> for <code>n &gt;= 0</code>; for <code>n &gt;= 1, T(n,1) = T(n,n-1) = n+1</code>; for <code>n &gt;= 2, T(n,k) = T(n-1,k-1) + T(n-2,k-1) + T(n-1,k)</code> if n is even and k <code>= n/2</code>, else <code>T(n,k) = T(n-1,k-1) + T(n-1,k)</code>.
 * @author Sean A. Irvine
 */
public class A026670 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if (m == 1 || m == n - 1) {
      return Z.valueOf(n + 1);
    }
    if ((n & 1) == 0 && 2 * m == n) {
      return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 2, m - 1));
    } else {
      return get(n - 1, m - 1).add(get(n - 1, m));
    }
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
