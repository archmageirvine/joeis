package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A389532 allocated for Gus Wiseman.
 * @author Sean A. Irvine
 */
public class A389649 extends A389352 {

  @Override
  protected Z select(final Point pt) {
    return Z.valueOf(pt.left());
  }
}
