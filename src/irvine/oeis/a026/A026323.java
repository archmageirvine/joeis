package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026323 Irregular triangular array T read by rows: T(0,0) = 1, T(0,1) = T(0,2) = 0; T(1,0) = T(1,1) = T(1,2) = 1, T(1,3) = 0; for n &gt;= 2, T(n,0) = 1, T(n,1) = T(n-1,0) + T(n-1,1), T(n,k) = T(n-1,k-2) + T(n-1,k-1) + T(n-1,k) for k = 2,3,...,n+1 and T(n,n+2) = T(n-1,n) + T(n-1,n+1).
 * @author Sean A. Irvine
 */
public class A026323 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (n == 1) {
      return m <= 2 ? Z.ONE : Z.ZERO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    if (m == 1) {
      return get(n - 1, 0L).add(get(n - 1, 1L));
    }
    if (m == n + 2) {
      return get(n - 1, n).add(get(n - 1, n + 1));
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN + 2) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
