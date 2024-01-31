package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068111 Numerators of coefficients in J0(i*sqrt(x))^2, where J0 denotes the ordinary Bessel function of order 0.
 * @author Sean A. Irvine
 */
public class A068111 extends A068110 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
