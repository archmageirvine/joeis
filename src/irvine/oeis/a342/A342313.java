package irvine.oeis.a342;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A342313 T(n, k) = (n + k - 1)*(n + k)*binomial(2*n + 1, n - k + 1) with T(0, 0) = T(1, 0) = 1. Triangle read by rows, T(n, k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A342313 extends Triangle {

  /** Construct the sequence. */
  public A342313() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n <= 1 && k == 0 ? Z.ONE : Binomial.binomial(2 * n + 1, n - k + 1).multiply(n + k - 1).multiply(n + k);
  }
}
