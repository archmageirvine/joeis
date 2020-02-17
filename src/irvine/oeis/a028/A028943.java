package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028943 Denominator of y coordinate of <code>n*P</code> where P is generator for rational points on curve <code>y^2+y = x^3-x</code>.
 * @author Sean A. Irvine
 */
public class A028943 extends A028942 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}

