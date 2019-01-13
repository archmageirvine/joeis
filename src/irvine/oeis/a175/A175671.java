package irvine.oeis.a175;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012857;

/**
 * A175671.
 * @author Sean A. Irvine
 */
public class A175671 extends A012857 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
