package irvine.oeis.a369;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A369931 Triangle read by rows: T(n,k) is the number of labeled simple graphs with n edges and k vertices and without endpoints or isolated vertices.
 * @author Gregory Morse
 */
public class A369931 extends Triangle {
  /** Construct the sequence. */
  public A369931() {
    setOffset(1);
  }

  /**
   * Count labeled graphs without endpoints or isolates.
   * @param n number of vertices
   * @param m number of edges
   * @return the count
   */
  public static Z count(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n; ++j) {
      sum = sum.signedAdd(((n - j) & 1) == 0, Binomial.binomial(n, j).multiply(A369928.count(j, m)));
    }
    return sum;
  }

  @Override
  protected Z compute(final int n, final int k) {
    return count(k + 1, n + 1);
  }
}
