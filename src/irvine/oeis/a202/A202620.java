package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012865;

/**
 * A202620 Denominators of coefficients in Taylor series expansion of <code>log(cotan(x)*arcsin(x))</code>.
 * @author Sean A. Irvine
 */
public class A202620 extends A012865 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
