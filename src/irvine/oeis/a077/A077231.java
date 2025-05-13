package irvine.oeis.a077;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A077230.
 * @author Sean A. Irvine
 */
public class A077231 extends A077230 {

  @Override
  protected Z select(final Q n) {
    return n.den().multiply(2L * mN + 1).divide2().max(Z.ONE);
  }
}
