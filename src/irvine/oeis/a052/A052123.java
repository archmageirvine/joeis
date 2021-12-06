package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052123 Log_2 of denominators of coefficients in the e.g.f. a(x) such that a(a(x)) = exp(x) - 1.
 * @author Sean A. Irvine
 */
public class A052123 extends A052104 {

  @Override
  protected Z select(final Q n) {
    return Z.valueOf(n.multiply(mF.factorial(mN)).den().bitLength() - 1);
  }
}
