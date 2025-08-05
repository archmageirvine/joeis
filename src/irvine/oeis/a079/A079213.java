package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079213 Triangle read by rows giving T(n,k) = number of sets of k black squares in an n X n checkerboard with the upper left corner colored black, such that the line joining any 2 squares slopes down to the right, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A079213 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int m, final int n, final int k) {
      if (k == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int np = k - 1; np < n; ++np) {
        for (int mp = k - 1; mp < m; ++mp) {
          if (((m + n + mp + np) & 1) == 0) {
            sum = sum.add(mB.get(mp, np, k - 1));
          }
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN, mM);
  }
}
