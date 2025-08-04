package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385927 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385927 extends A385925 {

  @Override
  protected Z select(final Q pq, final Q nm) {
    return nm.num();
  }
}
