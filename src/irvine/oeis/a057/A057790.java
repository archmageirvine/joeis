package irvine.oeis.a057;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057790 Table read by antidiagonals: T(n,k) = number of restricted knight's walks from (n,k) (n &gt;= 0, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A057790 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int k) {
    if (n <= 1 || k <= 1) {
      return Z.ONE;
    }
    return get(n + 1, k - 2).add(get(n - 2, k + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
