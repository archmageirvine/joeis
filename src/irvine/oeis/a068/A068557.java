package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068557 From denominators in expansion of tan(arcsinh(x)) - sin(arctanh(x)).
 * @author Sean A. Irvine
 */
public class A068557 extends A068556 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

