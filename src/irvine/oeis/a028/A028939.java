package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028939 <code>a(n) =</code> denominator of y-coordinate of <code>(2n)*P</code> where P is the generator for rational points on the curve <code>y^2 + y = x^3 - x</code>.
 * @author Sean A. Irvine
 */
public class A028939 extends A028938 {

  @Override
  protected Z select(final Q y) {
    return y.den();
  }
}

