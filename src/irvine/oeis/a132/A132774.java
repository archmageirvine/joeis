package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A132774 A natural number operator.
 * @author Georg Fischer
 */
public class A132774 extends BaseTriangle {

  /** Construct the sequence. */
  public A132774() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.valueOf(2 * n - 1) : ((k == n - 1) ? Z.valueOf(2 * n - 2) : Z.ZERO);
  }
}
