package irvine.oeis.a045;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A045689 Denominators of expansion of tan(sin(x)) - sin(tan(x)).
 * @author Sean A. Irvine
 */
public class A045689 extends A045688 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
