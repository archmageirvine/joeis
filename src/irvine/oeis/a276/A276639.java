package irvine.oeis.a276;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a084.A084546;

/**
 * A276639 Triangle T(m, n) = the number of point-labeled graphs with n points and m edges, no points isolated. By rows, n &gt;= 0, ceiling(n/2) &lt;= m &lt;= binomial(n,2).
 * @author Sean A. Irvine
 */
public class A276639 extends A084546 {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z t(final int n, final int m) {
    if (n == 1) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd(((n - k) & 1) == 0, Binomial.binomial(n, k).multiply(super.t(k, m)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = (mN + 1) / 2;
    }
    return t(mN, mM);
  }
}
