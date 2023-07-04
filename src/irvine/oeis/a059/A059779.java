package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A059779 A Lucas triangle: T(m,n), m &gt;= n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A059779 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int m, final int n) {
    if (m <= 1) {
      if (m == 0) {
        return Z.TWO;
      }
      return Z.ONE;
    }
    if (m == 2 && n == 1) {
      return Z.TWO;
    }
    if (m <= n + 1) {
      return get(m, m - n);
    }
    return get(m - 1, n).add(get(m - 2, n));
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
