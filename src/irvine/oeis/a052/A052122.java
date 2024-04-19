package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052122 Numerators of coefficients in the e.g.f. a(x) such that a(a(x)) = exp(x) - 1.
 * @author Sean A. Irvine
 */
public class A052122 extends A052104 {

  @Override
  protected Z select(final Q n) {
    return n.multiply(Functions.FACTORIAL.z(mN)).num();
  }
}
