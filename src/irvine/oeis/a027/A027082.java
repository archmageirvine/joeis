package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027082 Irregular triangular array: <code>T(n,0) = 1</code> for <code>n &gt;= 1; T(n,1) = T(n,2) = 1</code> for <code>n &gt;= 1; T(n,k) = T(n-1,k-3) + T(n-1,k-2) + T(n-1,k-1)</code> for <code>3 &lt;= k &lt;= 2n-1</code> and <code>n &gt;= 2</code>; and <code>T(n,2n) = T(n-1,2n-3) + T(n-1,2n-2)</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A027082 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (m <= 2) {
      return Z.ONE;
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
