package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A069986 Denominator of b(n) = binomial(2n,n)^3*(42n+5)/2^(12n+4).
 * @author Sean A. Irvine
 */
public class A069986 extends A069985 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

