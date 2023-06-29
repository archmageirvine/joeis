package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A115361 Inverse of matrix (1,x)-(x,x^2) (expressed in Riordan array notation).
 * @author Georg Fischer
 */
public class A115361 extends BaseTriangle {

  /** Construct the sequence. */
  public A115361() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // after Maple
    int j = 0;
    while (true) {
      if (k + (2 * j - 1) * (k + 1) > n) {
        return Z.ZERO;
      }
      if (k + ((1 << j) - 1) * (k + 1) == n) {
        return Z.ONE;
      }
      ++j;
    }
  }
}
