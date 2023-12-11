package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067269 extends A000217 {

  {
    next();
  }

  private static Z rotate(final Z t) {
    final String s = t.toString();
    return new Z(s.substring(1) + s.charAt(0));
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ZUtils.isTriangular(rotate(t))) {
        return t;
      }
    }
  }
}

