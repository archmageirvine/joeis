package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028937 Denominator of x-coordinate of <code>(2n)*P</code> where P is the generator for rational points on the curve <code>y^2 + y = x^3 - x</code>.
 * @author Sean A. Irvine
 */
public class A028937 extends A028936 {

  @Override
  protected Z select(final Q x) {
    return x.den();
  }
}

