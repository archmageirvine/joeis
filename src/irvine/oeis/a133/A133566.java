package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A133566 Triangle read by rows: (1,1,1,...) on the main diagonal and (0,1,0,1,...) on the subdiagonal.
 * @author Georg Fischer
 */
public class A133566 extends BaseTriangle {

  /** Construct the sequence. */
  public A133566() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n == k) {
      return Z.ONE;
    }
    if (n - 1 == k) {
      return ((n & 1) == 0) ? Z.ZERO : Z.ONE;
    }
    return Z.ZERO;
  }
}
