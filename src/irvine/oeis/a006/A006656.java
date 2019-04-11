package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000965;

/**
 * A006656 Denominators of expansion of sinh <code>x /</code> sin x.
 * @author Sean A. Irvine
 */
public class A006656 extends A000965 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
