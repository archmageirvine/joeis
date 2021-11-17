package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006259 Denominators of approximations to e.
 * @author Sean A. Irvine
 */
public class A006259 extends A006258 {

  @Override
  protected Z toZ(final Q fraction) {
    return fraction.den();
  }
}
