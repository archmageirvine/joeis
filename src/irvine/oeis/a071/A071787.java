package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071787 extends Sequence1 {

  private int mN = 0;
  private Z mDen = null;

  private final MemoryFunctionInt2<Q> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int m) {
      if (n == 0) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      for (int k = 1; k <= m; ++k) {
        sum = sum.add(get(n, k - 1).multiply(get(n - 1, m - k + 1)).multiply(k));
      }
      return get(n - 1, m + 1).subtract(sum.divide(m + 1)).divide(get(n - 1, 0));
    }
  };

  @Override
  public Z next() {
    if (mDen != null) {
      final Z res = mDen;
      mDen = null;
      return res;
    }
    final Q t = mB.get(++mN, 0);
    mDen = t.den();
    return t.num();
  }
}
