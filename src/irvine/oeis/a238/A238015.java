package irvine.oeis.a238;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a033.A033473;

/**
 * A238015 Denominator of (2*n+1)!*8*Bernoulli(2*n,1/2).
 * @author Sean A. Irvine
 */
public class A238015 extends A033473 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

