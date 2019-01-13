package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012854;

/**
 * A202379.
 * @author Sean A. Irvine
 */
public class A202379 extends A012854 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
