package irvine.oeis.a000;

import irvine.math.IntegerUtils;

/**
 * A000088.
 * @author Sean A. Irvine
 */
public class A000088 extends A000273 {

  private int y(final int d, final int k, final int[] a) {
    int r = 0;
    for (int s = 1; s <= d; ++s) {
      if (k * s <= mN && d % s == 0 && IntegerUtils.gcd(k, d / s) == 1) {
        r += s * a[k * s];
      }
    }
    return r;
  }

  @Override
  protected int g(final int ord, final int[] a) {
    int g = 0;
    for (int d = 1; d <= ord; ++d) {
      final int y1 = y(d, 1, a);
      g += y1 * (y1 - 1) / 2;
      g += y(d, 2, a);
    }
    return g;
  }
}
