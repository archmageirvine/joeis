package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013516;

/**
 * A047692 Denominators of coefficients in Taylor series for <code>exp(tan(x))</code>.
 * @author Sean A. Irvine
 */
public class A047692 extends A013516 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
