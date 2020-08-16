package irvine.oeis.a336;

import irvine.oeis.a001.A001666;

/**
 * A336906 Number of <code>n-step self-avoiding</code> walks on the b.c.c. lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336906 extends A001666 {

  @Override
  protected boolean check(final int point, final int n) {
    if (!super.check(point, n)) {
      return false;
    }
    int neighbourCount = -1;
    for (final int delta : DELTAS) {
      final int newPoint = point + delta;
      if (contains(newPoint, n) && ++neighbourCount > 0) {
        return false;
      }
    }
    return true;
  }
}
