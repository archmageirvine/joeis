package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A054380 Reduced denominators of the coefficients in a series expansion for Gamma[x].
 * @author Sean A. Irvine
 */
public class A054380 extends A054379 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
