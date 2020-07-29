package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A034010.
 * @author Sean A. Irvine
 */
public class A034010 extends A002931 {

  private boolean isOk(final Polygon p) {
    boolean sawOrigin = false;
    for (final Point pt : p) {
      if (pt.left() < 0 || pt.right() < 0) {
        return false;
      } else if (pt.left() == 0 && pt.right() == 0) {
        sawOrigin = true;
      }
    }
    return sawOrigin;
  }

  @Override
  protected Z postFilter() {
    long c = 0;
    for (final Polygon p : mPolygons) {
      if (isOk(p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

