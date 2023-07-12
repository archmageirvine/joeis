package irvine.oeis.a330;
// manually tresimple at 2023-07-12

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A330613 Triangle read by rows: T(n, k) = 1 + k - 2*n - 2*k*n + 2*n^2, with 0 &lt;= k &lt; n.
 * @author Georg Fischer
 */
public class A330613 extends BaseTriangle {

  /** Construct the sequence. */
  public A330613() {
    super(1, 1, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.ONE.add(k - 2 * n * (1 + k - n));
  }
}
