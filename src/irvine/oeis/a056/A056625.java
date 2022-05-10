package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056625 a(n) is the total area of all self-avoiding polygons of length 2n on the square lattice.
 * @author Sean A. Irvine
 */
public class A056625 extends A002931 {

  {
    super.next();
  }

  @Override
  protected Z postFilter() {
    Z total = Z.ZERO;
    for (final Polygon polygon : mPolygons) {
      // Area
      int area = 0;
      Point pt0 = null;
      for (final Point pt1 : polygon) {
        if (pt0 != null) {
          area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        }
        pt0 = pt1;
      }
      // Wrap around to get the last point closing the polygon
      for (final Point pt1 : polygon) {
        area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        break;
      }
      total = total.add(area / 2);
    }
    return total;
  }
}
