package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A060379 Number of self-avoiding polygons on the 2-dimensional square lattice with perimeter 2n with at most 4 horizontal edges in each vertical cross-section.
 * @author Sean A. Irvine
 */
public class A060379 extends A002931 {

  {
    super.next();
  }

  private boolean isAcceptable(final Polygon polygon) {
    final int[] cnts = new int[100];
    Point prev = null;
    for (final Point pt : polygon) {
      if (prev == null) {
        prev = pt;
      } else {
        if (pt.right().equals(prev.right())) {
          // Horizontal line
          final int x = Math.min(pt.left(), prev.left());
          if (++cnts[x] > 4) {
            return false;
          }
        }
        prev = pt;
      }
    }
    return true;
  }

  protected Z postFilter() {
    long count = 0;
    for (final Polygon p : mPolygons) {
      if (isAcceptable(p)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

