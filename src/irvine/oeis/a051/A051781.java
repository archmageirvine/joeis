package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051781 Denominators of Taylor series expansion of (exp(1-exp(x))-1)/(1-exp(x)).
 * @author Sean A. Irvine
 */
public class A051781 extends A051780 {

  @Override
  protected Z select(final Q coeff) {
    return coeff.den();
  }
}
