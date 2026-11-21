package irvine.oeis.a369;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a084.A084546;

/**
 * A369928 Triangle read by rows: T(n,k) is the number of simple graphs on n labeled vertices with k edges and without endpoints, n &gt;= 0, 0 &lt;= k &lt;= n*(n-1)/2.
 * @author Gregory Morse
 */
public class A369928 extends A084546 {
  /**
   * Count labeled graphs without endpoints.
   * @param n number of vertices
   * @param m number of edges
   * @return the count
   */
  public static Z count(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int s = 0; s <= n; ++s) {
      Z fixed = Z.ZERO;
      for (int j = 0; j <= s / 2; ++j) {
        // Of the s prescribed endpoints, 2j are paired with one another.
        final Z pairs = Binomial.binomial(s, 2 * j).multiply(Functions.MULTIFACTORIAL.z(2, 2 * j - 1));
        final Z other = Z.valueOf(n - s).pow(s - 2 * j);
        final long edges = (long) (n - s) * (n - s - 1) / 2;
        fixed = fixed.add(pairs.multiply(other).multiply(Binomial.binomial(edges, m - s + j)));
      }
      sum = sum.signedAdd((s & 1) == 0, fixed.multiply(Binomial.binomial(n, s)));
    }
    return sum;
  }

  @Override
  protected Z t(final int n, final int m) {
    return count(n, m);
  }
}
