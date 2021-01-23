package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028939 a(n) = denominator of y-coordinate of (2n)*P where P is the generator for rational points on the curve y^2 + y = x^3 - x.
 * @author Sean A. Irvine
 */
public class A028939 extends A028938 {

  @Override
  protected Z select(final Q y) {
    return y.den();
  }
}

