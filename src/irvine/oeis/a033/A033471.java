package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A033471 Denominator of Bernoulli(2n,1/3).
 * @author Sean A. Irvine
 */
public class A033471 extends A033470 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
