package irvine.oeis.a068;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068009 Square array T(m,n) with m (row) &gt;= 1 and n (column) &gt;= 0 read by antidiagonals: number of subsets of {1,2,3,...n} that sum to 0 mod m (including the empty set whose sum is 0).
 * @author Sean A. Irvine
 */
public class A068009 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int t) {
      if (n == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, m, t).add(get(n - 1, m, (t + n) % m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM + 1, 0);
  }
}
