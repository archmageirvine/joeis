package irvine.oeis.a156;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A156319 Triangle by columns: (1, 2, 0, 0, 0, ...) in every column.
 * @author Georg Fischer
 */
public class A156319 extends BaseTriangle {

  /** Construct the sequence. */
  public A156319() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == k) ? Z.ONE : ((n - 1 == k) ? Z.TWO : Z.ZERO);
  }
}
