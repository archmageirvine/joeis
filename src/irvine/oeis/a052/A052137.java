package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052137 Denominators of power series coefficients of a(x) satisfying a(a(a(x)))= arctan(x).
 * @author Sean A. Irvine
 */
public class A052137 extends A052136 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

