package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A054388 Denominators of coefficients of 1/2^(2n+1) in Newton's series for Pi.
 * @author Sean A. Irvine
 */
public class A054388 extends A054387 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
