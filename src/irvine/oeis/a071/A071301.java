package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071301 extends A071300 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
