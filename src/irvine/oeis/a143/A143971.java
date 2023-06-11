package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143971 Triangle read by rows, (3n-2) subsequences decrescendo.
 * @author Georg Fischer
 */
public class A143971 extends BaseTriangle {

  /** Construct the sequence. */
  public A143971() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(3 * (n - k + 1) - 2);
  }
}
