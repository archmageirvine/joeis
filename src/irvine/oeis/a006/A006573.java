package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006573.
 * @author Sean A. Irvine
 */
public class A006573 extends A006572 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
