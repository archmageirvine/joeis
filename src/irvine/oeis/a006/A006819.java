package irvine.oeis.a006;

import irvine.oeis.a001.A001412;

/**
 * A006819.
 * @author Sean A. Irvine
 */
public class A006819 extends A001412 {

  /*
   * Check if this walk contains a particular edge.
   */
  private boolean contains(final int prevPoint, final int point, final int n) {
    for (int k = 1; k <= n; ++k) {
      final int p = getPathElement(k - 1);
      final int q = getPathElement(k);
      if ((p == prevPoint && q == point) || (p == point && q == prevPoint)) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected boolean check(final int point, final int n) {
    return !contains(getPathElement(n), point, n);
  }
}
