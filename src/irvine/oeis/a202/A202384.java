package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012862;

/**
 * A202384.
 * @author Sean A. Irvine
 */
public class A202384 extends A012862 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
