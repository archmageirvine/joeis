package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048149 Array T read by diagonals: T(i,j) = number of pairs (h,k) with h^2+k^2 &lt;= i^2+j^2, h&gt;=0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A048149 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Yu-Sheng Chang

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < m) {
      return get(m, n);
    }
    Z c = Z.ZERO;
    final long sq = n * n + m * m;
    for (long x = 0; x <= LongUtils.sqrt(sq); ++x) {
      c = c.add(LongUtils.sqrt(sq - x * x) + 1);
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}

