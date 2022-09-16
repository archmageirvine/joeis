package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A059240 Denominators of coefficients of asymptotic expansion related to iterated sine function.
 * @author Sean A. Irvine
 */
public class A059240 extends A059239 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
