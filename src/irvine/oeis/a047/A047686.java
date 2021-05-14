package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A047686 Denominators of coefficients in Taylor series for log(tan(x)/x).
 * @author Sean A. Irvine
 */
public class A047686 extends A047685 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
