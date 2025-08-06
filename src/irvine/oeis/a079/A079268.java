package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079268 Triangle read by rows: d(n,k) = number of decreasing labeled trees with n nodes and largest leaf &lt;= k, for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A079268 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0 || k == 1) {
        return Z.ONE;
      }
      if (k < 0 || k > n) {
        return Z.ZERO;
      }
      Z sum = get(n - 1, k).add(get(n, k - 1));
      for (int x = 0; x < n - k; ++x) {
        Z s = Z.ZERO;
        for (int w = 0; w <= k - 2; ++w) {
          s = s.add(Binomial.binomial(k - 1, w).multiply(get(n - k + w - x, w + 1)).multiply(get(k - w + x, k - w - 1)));
        }
        sum = sum.add(s.multiply(Binomial.binomial(n - k, x)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}

