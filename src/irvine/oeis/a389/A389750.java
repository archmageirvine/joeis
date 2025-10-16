package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A389750 extends A389749 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
