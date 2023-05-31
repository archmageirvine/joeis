package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A133109 Triangle read by rows, A042965 on the diagonal, 0 elsewhere.
 * @author Georg Fischer
 */
public class A133109 extends BaseTriangle {

  /** Construct the sequence. */
  public A133109() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == k) ? Z.valueOf((4 * (n + 1) - 3) / 3) : Z.ZERO;
  }
}
