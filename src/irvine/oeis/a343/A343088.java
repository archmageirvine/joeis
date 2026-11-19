package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.a062.A062734;
import irvine.oeis.triangle.Triangle;

/**
 * A343088 Triangle read by rows: T(n,k) is the number of connected labeled graphs with n edges and k vertices, 1 &lt;= k &lt;= n+1.
 * @author Gregory Morse
 */
public class A343088 extends Triangle {

  private final A062734 mGraphs = new A062734();

  @Override
  protected Z compute(final int n, final int k) {
    return n > (long) k * (k + 1) / 2 ? Z.ZERO : mGraphs.t(k + 1, n);
  }
}
