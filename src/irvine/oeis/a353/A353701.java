package irvine.oeis.a353;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058010.
 * @author Sean A. Irvine
 */
public class A353701 extends A353700 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
