package irvine.oeis.a008;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A008994.
 * @author Sean A. Irvine
 */
public class A008994 extends A008993 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

