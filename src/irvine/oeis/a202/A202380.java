package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012856;

/**
 * A202380.
 * @author Sean A. Irvine
 */
public class A202380 extends A012856 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
