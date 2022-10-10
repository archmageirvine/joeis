package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059780 A generalized Pascal triangle of order 3: T(n,m), n &gt;= 0, 2*n &gt;= m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A059780 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    if (m == 2 * n) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.valueOf(1 + (m & 1));
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m)).subtract(get(n - 2, m - 2).multiply2());
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
