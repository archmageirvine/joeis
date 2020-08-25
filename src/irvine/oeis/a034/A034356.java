package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034356 Triangle read by rows giving T(n,k) = number of inequivalent linear [n,k] binary codes (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A034356 extends A034253 {

  private int mN = 0;
  private int mM = 0;

  protected Z v(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = m; k <= n; ++k) {
      sum = sum.add(u(k, m));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return v(mN, mM);
  }
}

