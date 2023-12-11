package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049063 Triangle a(n,k) (0 &lt;= k &lt;= max(0, 2n-1)) of profile numbers.
 * @author Sean A. Irvine
 */
public class A049063 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    if (m == 1) {
      return Z.TWO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m - 2).multiply2());
  }

  @Override
  public Z next() {
    if (++mM > Math.max(0, 2 * mN - 1)) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
