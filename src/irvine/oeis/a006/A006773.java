package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A006773 Sum of squared spans of 2n-step polygons on square lattice.
 * @author Sean A. Irvine
 */
public class A006773 extends A002931 {

  @Override
  protected Z postFilter() {
    Z linearSpanSum = Z.ZERO;
    for (final Polygon p : mPolygons) {
      long x = 0;
      for (final Point pt : p) {
        x = Long.max(x, pt.left());
      }
      linearSpanSum = linearSpanSum.add(x * x);
    }
    return linearSpanSum;
  }
}
