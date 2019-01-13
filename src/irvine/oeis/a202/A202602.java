package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012861;

/**
 * A202602.
 * @author Sean A. Irvine
 */
public class A202602 extends A012861 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
