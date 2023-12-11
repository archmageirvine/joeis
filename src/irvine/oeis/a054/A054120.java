package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A054120 Triangular array T(n,k): start with T(n,0)=T(n,n)=1 for n &gt;= 0; recursively, draw vertical lines through T(n-1,k-1) if present and T(n-1,k) if present; then T(n,k) is the sum of T(i,j) that lie on or between the lines and not below T(n,k).
 * @author Sean A. Irvine
 */
public class A054120 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if (n == 2 && m == 1) {
      return Z.THREE;
    }
    return get(n - 1, m - 1).add(get(n - 2, m - 1).multiply2()).add(get(n - 1, m));
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
