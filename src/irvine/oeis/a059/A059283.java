package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A059283 Triangle T(n,k) (0&lt;= k &lt;=n) read by rows. Left edge is 1, 0, 0, ... Otherwise each entry is sum of entry to left, entries immediately above it to left and right and entry directly above it 2 rows back.
 * @author Sean A. Irvine
 */
public class A059283 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0 && m == 0) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.ZERO;
    }
    if (0 <= m && m <= n) {
      return get(n, m - 1).add(get(n - 1, m - 1)).add(get(n - 1, m)).add(get(n - 2, m - 1));
    }
    return Z.ZERO;
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
