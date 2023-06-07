package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A132119 A002260 + A000027 - A000012 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A132119 extends BaseTriangle {

  /** Construct the sequence. */
  public A132119() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    final Z tri = Z.valueOf(n * (n + 1) / 2);
    return (k == n || k == 1) ? tri : tri.subtract(n - k);
  }
}
