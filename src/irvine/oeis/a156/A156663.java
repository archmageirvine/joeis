package irvine.oeis.a156;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A156663 Triangle by columns, powers of 2 interleaved with zeros.
 * @author Georg Fischer
 */
public class A156663 extends BaseTriangle {

  /** Construct the sequence. */
  public A156663() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.ONE : ((((n - k) & 1) == 0) ? Z.ONE.shiftLeft((n - k) / 2) : Z.ZERO);
  }
}
