package irvine.oeis.a145;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A145677 Triangle T(n, k) read by rows: T(n, 0) = 1, T(n, n) = n, n&gt;0, T(n,k) = 0, 0 &lt; k &lt; n-1.
 * @author Georg Fischer
 */
public class A145677 extends BaseTriangle {

  /** Construct the sequence. */
  public A145677() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0) ? Z.ONE : (k == n) ? Z.valueOf(n) : Z.ZERO;
  }
}
