package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003283 Denominators of coefficients of Green function for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003283 extends A003282 {

  @Override
  protected Z toZ(final Q q) {
    return q.den();
  }
}
