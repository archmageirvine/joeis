package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012868;

/**
 * A202622 Denominators of coefficients in Taylor series expansion of log(cotan(x)*arcsinh(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A202622 extends A012868 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
