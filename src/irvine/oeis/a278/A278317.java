package irvine.oeis.a278;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A278317 Number of neighbors of each new term in a right triangle read by rows.
 * @author Georg Fischer
 */
public class A278317 extends BaseTriangle {

  /** Construct the sequence. */
  public A278317() {
    super(1, 0, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.valueOf(k + 1);
    }
    if (k == 0) {
      return Z.TWO;
    }
    if (n == 2) {
      return Z.valueOf(4 - k);
    }
    final int m = n + 2 - k;
    return Z.valueOf((m > 4) ? 4 : m);
  }
}
