package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003302 Denominators of coefficients of Green function for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003302 extends A003301 {

  @Override
  protected Z toZ(final Q q) {
    return q.den();
  }
}
