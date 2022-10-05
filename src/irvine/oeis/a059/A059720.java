package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A059720 Triangle T(n,k), 0&lt;=k&lt;=n, formed from coefficients when formula for n-th diagonal of triangle in A059718 is written as a sum of binomial coefficients.
 * @author Sean A. Irvine
 */
public class A059720 extends A059718 {

  private int mN = -1;
  private int mM = 0;
  private Z[] mRow = null;

  protected Z[] step(final int n) {
    if (n == 0) {
      return new Z[] {Z.ONE};
    }
    final Z[] row = new Z[n + 1];
    row[0] = Z.ZERO;
    for (int m = 1; m <= n; ++m) {
      Z t = t(n + m - 1, n);
      for (int k = 1; k < m; ++k) {
        t = t.subtract(row[k].multiply(Binomial.binomial(m, k)));
      }
      row[m] = t;
    }
    return row;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      mRow = step(++mN);
    }
    return mRow[mM];
  }
}

