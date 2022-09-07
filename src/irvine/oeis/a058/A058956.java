package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058955.
 * @author Sean A. Irvine
 */
public class A058956 extends A058955 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
