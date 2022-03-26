package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028937 Denominator of x-coordinate of (2n)*P where P = (0,0) is the generator for rational points on the curve y^2 + y = x^3 - x.
 * @author Sean A. Irvine
 */
public class A028937 extends A028936 {

  @Override
  protected Z select(final Q x) {
    return x.den();
  }
}

