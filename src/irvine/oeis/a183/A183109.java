package irvine.oeis.a183;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A183109 Triangle read by rows: T(n,m) = number of n X m binary matrices with no zero rows or columns (n &gt;= 1, 1 &lt;= m &lt;= n).
 * @author Gregory Morse
 */
public class A183109 extends Triangle {
  /** Construct the sequence. */
  public A183109() {
    setOffset(1);
  }

  /**
   * Count binary matrices with no zero row or column.
   * @param m number of rows
   * @param n number of columns
   * @return the count
   */
  public static Z matrices(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= m; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(m, k).multiply(Z.ONE.shiftLeft(m - k).subtract(1).pow(n)));
    }
    return sum;
  }

  @Override
  protected Z compute(final int n, final int k) {
    return matrices(n + 1, k + 1);
  }
}
