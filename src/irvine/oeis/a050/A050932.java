package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A050932 Denominator of (n+1)*Bernoulli(n).
 * @author Sean A. Irvine
 */
public class A050932 extends A050925 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
