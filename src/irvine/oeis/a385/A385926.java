package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385926 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385926 extends A385925 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
