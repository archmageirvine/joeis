package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A033466 Denominators of the first differences of 1/(n^2 + 1).
 * @author Sean A. Irvine
 */
public class A033466 extends A033465 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

