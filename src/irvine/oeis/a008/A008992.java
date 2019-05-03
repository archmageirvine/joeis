package irvine.oeis.a008;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A008992 Denominators of coefficients in expansion of <code>sqrt(sin(x)/x)</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A008992 extends A008991 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

