package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A132778 Triangle read by rows, n-1 terms of (2n - 1) followed by n.
 * @author Georg Fischer
 */
public class A132778 extends BaseTriangle {

  /** Construct the sequence. */
  public A132778() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf((n != k) ? 2L * n - 1 : n);
  }
}
