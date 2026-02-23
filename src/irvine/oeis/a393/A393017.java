package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A393017 Triangle read by rows: T(n, k) = denominator(8*n^3*k/(k^2+4*n^2)).
 * @author Sean A. Irvine
 */
public class A393017 extends A393016 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
