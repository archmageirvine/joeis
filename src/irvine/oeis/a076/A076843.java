package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076843 extends A076842 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
