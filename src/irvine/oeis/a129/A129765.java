package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A129765 Triangle, (1, 1, 2, 2, 2, ...) in every column.
 * @author Georg Fischer
 */
public class A129765 extends BaseTriangle {

  /** Construct the sequence. */
  public A129765() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k >= n - 1) ? Z.ONE : Z.TWO;
  }
}
