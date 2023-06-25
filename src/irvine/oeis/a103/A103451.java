package irvine.oeis.a103;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A103451 Triangular array T read by rows: T(n, 0) = T(n, n) = 1, T(n, k) = 0 for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A103451 extends BaseTriangle {

  /** Construct the sequence. */
  public A103451() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n || k == 0) ? Z.ONE : Z.ZERO;
  }
}

