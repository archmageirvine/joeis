package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028943 Denominator of y coordinate of n*P where P is generator for rational points on curve y^2+y = x^3-x.
 * @author Sean A. Irvine
 */
public class A028943 extends A028942 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}

