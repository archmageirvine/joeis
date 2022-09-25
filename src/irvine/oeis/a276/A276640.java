package irvine.oeis.a276;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A276640 Triangle T(n, k) = the number of point-labeled graphs with n points and k edges, no points isolated, no edges isolated. By rows, 0 &lt;= n, ceiling(2*n/3) &lt;= k &lt;= binomial(n, 2).
 * @author Sean A. Irvine
 */
public class A276640 extends A276639 {

  private int mN = 1;
  private int mM = 0;

  @Override
  protected Z t(final int n, final int m) {
    if (n < 2) {
      return Z.ZERO;
    }
    if (n == 2) {
      return m == 2 ? Z.ONE : Z.ZERO;
    }
    if (n == 3) {
      if (m < 2 || m > 3) {
        return Z.ZERO;
      }
      return m == 2 ? Z.THREE : Z.ONE;
    }
    Z sum = Z.ZERO;
    final int lim = Math.min(n / 2, m);
    for (int k = 0; k <= lim; ++k) {
      sum = sum.signedAdd((k & 1) == 0,
        Binomial.binomial(n, 2L * k)
          .multiply(MemoryFactorial.SINGLETON.factorial(2 * k))
          .multiply(super.t(n - 2 * k, m - k))
          .shiftRight(k)
          .divide(MemoryFactorial.SINGLETON.factorial(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = (2 * mN + 2) / 3;
    }
    return t(mN, mM);
  }
}
