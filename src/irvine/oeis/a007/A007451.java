package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A007451 Denominators of expansion of exp <code>x /</code> sin x.
 * @author Sean A. Irvine
 */
public class A007451 extends A007418 {

  @Override
  protected Z select(final Q coeff) {
    return coeff.den();
  }
}
