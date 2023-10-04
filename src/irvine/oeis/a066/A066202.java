package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066202 Array T(n,k) (n&gt;=1, k&gt;=1) read by antidiagonals: T(n,n) = 1 for all n; fill in array above diagonal by symmetry; for row n, starting at diagonal T(n,n)=1, for k &gt; n, T(n,k) = T(n,k-1)-(k-1) if this is positive and has not already appeared in this row, otherwise T(n,k) = T(n,k-1)+(k-1).
 * @author Sean A. Irvine
 */
public class A066202 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean seen(final int n, final int m, final long t) {
      for (int k = 0; k < m; ++k) {
        if (get(n, k) == t) {
          return true;
        }
      }
      return false;
    }

    @Override
    protected Long compute(final int n, final int m) {
      if (n == m) {
        return 1L;
      }
      if (m < n) {
        return get(m, n);
      }
      final long t = get(n, m - 1) - (m - 1);
      if (t > 0 && !seen(n, m, t)) {
        return t;
      }
      return get(n, m - 1) + m - 1;
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mB.get(mN - mM, mM + 1));
  }
}
