package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A389649 X coordinate of point n while traversing the half plane by integer points in rectangular layers starting from n=1 at the origin.
 * @author Sean A. Irvine
 */
public class A389649 extends A389352 {

  @Override
  protected Z select(final Point pt) {
    return Z.valueOf(pt.left());
  }
}
