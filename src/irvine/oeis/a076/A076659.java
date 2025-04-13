package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076659 extends A076658 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
