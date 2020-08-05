package irvine.oeis.a336;

import irvine.oeis.a001.A001668;
import irvine.util.Point;

/**
 * A336758 Number of <code>n-step self-avoiding</code> walks on the honeycomb lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336758 extends A001668 {

  @Override
  protected boolean check(final int x, final int y) {
    int neighbourCount = -1;
    if (mVisited.contains(new Point(x + 1, y))) {
      ++neighbourCount;
    }
    if (mVisited.contains(new Point(x - 1, y)) && ++neighbourCount > 0) {
      return false;
    }
    return !mVisited.contains(new Point(x, y - 1 + 2 * ((x + y) & 1))) || ++neighbourCount <= 0;
  }
}
