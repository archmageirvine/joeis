package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A059247 Denominator of Sum_{j=1..n} d(j)/n, where d = number of divisors function (A000005).
 * @author Sean A. Irvine
 */
public class A059247 extends A059246 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
