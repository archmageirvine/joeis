package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A085084.
 * @author Sean A. Irvine
 */
public class A085091 extends A085085 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
