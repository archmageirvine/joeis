package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052105 Denominators of coefficients in the formal power series a(x) such that a(a(x)) = exp(x) - 1.
 * @author Sean A. Irvine
 */
public class A052105 extends A052104 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
