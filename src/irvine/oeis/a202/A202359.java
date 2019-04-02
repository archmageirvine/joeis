package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013305;

/**
 * A202359 Denominators of coefficients in Taylor series expansion of arccosh(exp(x)-sin(x)).
 * @author Sean A. Irvine
 */
public class A202359 extends A013305 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
