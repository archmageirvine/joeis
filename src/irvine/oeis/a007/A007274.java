package irvine.oeis.a007;

import irvine.oeis.a001.A001334;

/**
 * A007274.
 * @author Sean A. Irvine
 */
public class A007274 extends A001334 {

  @Override
  protected boolean contains(final int point, final int n) {
    int count = 0;
    for (int k = 0; k <= n; ++k) {
      if (getPathElement(k) == point && ++count > 1) {
        return true;
      }
    }
    return false;
  }
}
