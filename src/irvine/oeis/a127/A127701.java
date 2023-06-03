package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A127701 Infinite lower triangular matrix with (1, 2, 3, ...) in the main diagonal, (1, 1, 1, ...) in the subdiagonal and the rest zeros.
 * @author Georg Fischer
 */
public class A127701 extends BaseTriangle {

  /** Construct the sequence. */
  public A127701() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.valueOf(n) : ((k == n - 1) ? Z.ONE : Z.ZERO);
  }
}
