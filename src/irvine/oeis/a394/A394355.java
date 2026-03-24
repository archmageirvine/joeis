package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394355 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394355 extends A394354 {

  @Override
  protected Z select(final Q pq, final Q mn) {
    return pq.num();
  }
}
