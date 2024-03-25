package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068918 Denominators of coefficients in 1/sin(x) - 1/sinh(x) power series.
 * @author Sean A. Irvine
 */
public class A068918 extends A068917 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

