package irvine.oeis.a353;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A353701 Denominator of squared radius of smallest circle passing through exactly n integral points.
 * @author Sean A. Irvine
 */
public class A353701 extends A353700 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
