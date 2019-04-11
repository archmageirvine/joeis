package irvine.oeis.a210;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A210252 Triangle read by rows: T(n,k) is the number of c-nets with <code>n+1</code> faces and <code>k+1</code> vertices, <code>1 &lt;= k &lt;= n.</code> But see A290326 for a better version.
 * @author Sean A. Irvine
 */
public class A210252 implements Sequence {

  /**
   * The number of simple quadrangulations.
   * @param m vertices
   * @param n faces
   * @return the number of simple quadrangulations
   */
  public static Z qStar(final int m, final int n) {
    if (m > n) {
      throw new UnsupportedOperationException(); // not defined
    }
    if (m <= (n + 2) / 2) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < m; ++k) {
      final Z b1 = Binomial.binomial(2L * n, m - k - 1);
      final Z b2 = Binomial.binomial(2L * n - 1, m - k - 2).shiftLeft(2);
      for (int j = 0; j < n; ++j) {
        final Z c1 = b1.multiply(Binomial.binomial(2L * m, n - j - 1));
        final Z c2 = b2.multiply(Binomial.binomial(2L * m - 1, n - j - 2));
        final Z t = c1.subtract(c2).multiply(Binomial.multinomial(k + j + 2, k, j, 2));
        sum = sum.signedAdd(((k + j) & 1) == 1, t);
      }
    }
    return sum;
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return qStar(mM, mN);
  }
}
