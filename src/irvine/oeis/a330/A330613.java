package irvine.oeis.a330;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A330613 Triangle read by rows: T(n, k) = 1 + k - 2*n - 2*k*n + 2*n^2, with 0 &lt;= k &lt; n.
 * @author Georg Fischer
 */
public class A330613 extends Triangle {

  /** Construct the sequence. */
  public A330613() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(1 + k).subtract(2 * (n + 1)).subtract(2 * k * (n + 1)).add((n + 1) * (n + 1) * 2);
  }
}
