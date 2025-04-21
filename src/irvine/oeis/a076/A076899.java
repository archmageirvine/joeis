package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076899 extends A076898 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
