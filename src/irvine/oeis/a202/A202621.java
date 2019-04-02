package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012867;

/**
 * A202621 Denominators of coefficients in Taylor series expansion of log(cotan(x)*arctan(x)).
 * @author Sean A. Irvine
 */
public class A202621 extends A012867 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
