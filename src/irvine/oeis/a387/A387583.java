package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a389.A389342;

/**
 * A387583 Denominator D(n) of the rational part in J(n) = Integral_{x=0..Pi/2} x*cos(x)^(2n) dx.
 * @author Sean A. Irvine
 */
public class A387583 extends A389342 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
