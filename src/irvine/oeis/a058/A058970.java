package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058970 Denominators of expansion of a function eta(x) related to Cremer points.
 * @author Sean A. Irvine
 */
public class A058970 extends A058969 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
