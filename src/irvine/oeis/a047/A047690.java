package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A047690 Denominators of coefficients in Taylor series for exp(cos(x)-1).
 * @author Sean A. Irvine
 */
public class A047690 extends A047689 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
