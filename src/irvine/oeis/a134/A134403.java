package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A134403 Triangle read by rows: row n consists of (n, n, (n+1), (n+2), (n+3), ...).
 * @author Georg Fischer
 */
public class A134403 extends BaseTriangle {

  /** Construct the sequence. */
  public A134403() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf((k == 0) ? n : n + k - 1);
  }
}
