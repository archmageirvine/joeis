package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A127774 Triangle read by rows: row n consists of n-1 zeros followed by A000292(n).
 * @author Georg Fischer
 */
public class A127774 extends BaseTriangle {

  /** Construct the sequence. */
  public A127774() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k < n) ? Z.ZERO : Z.valueOf(n).multiply(n + 1).multiply(n + 2).divide(6);
  }
}
