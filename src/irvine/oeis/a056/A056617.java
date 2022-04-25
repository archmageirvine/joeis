package irvine.oeis.a056;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A056617 Denominator of binomial(2*n,n) / (2*n+1).
 * @author Sean A. Irvine
 */
public class A056617 extends A056616 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

