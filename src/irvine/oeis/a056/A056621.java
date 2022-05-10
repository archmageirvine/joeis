package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056621 a(n) is the total radius of gyration of all self-avoiding polygons of length 2n on the square lattice.
 * @author Sean A. Irvine
 */
public class A056621 extends A002931 {

  {
    super.next();
  }

  @Override
  protected Z postFilter() {
    Z total = Z.ZERO;
    for (final Polygon polygon : mPolygons) {
      // Radius of gyration
      long r2 = 0;
      for (final Point pt1 : polygon) {
        final int x1 = pt1.left();
        final int y1 = pt1.right();
        for (final Point pt2 : polygon) {
          if (pt2 == pt1) {
            break;
          }
          final int x2 = pt2.left();
          final int y2 = pt2.right();
          final long dx = x1 - x2;
          final long dy = y1 - y2;
          r2 += dx * dx + dy * dy;
        }
      }
      total = total.add(r2);
    }
    return total;
  }
}
