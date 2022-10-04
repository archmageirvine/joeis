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

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
      mRow = new Z[mN + 1];
      mRow[0] = Z.ZERO;
      for (int m = 1; m <= mN; ++m) {
        Z t = t(mN + m - 1, mN);
        for (int k = 1; k < m; ++k) {
          t = t.subtract(mRow[k].multiply(Binomial.binomial(m, k)));
        }
        mRow[m] = t;
      }
    }
    return mRow[mM];
  }
}

