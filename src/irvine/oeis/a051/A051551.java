package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051551 Denominators in expansion of 1/(10+sqrt(36+x)).
 * @author Sean A. Irvine
 */
public class A051551 extends A051550 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
