package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057021 Denominator of (sum of divisors of n / number of divisors of n).
 * @author Sean A. Irvine
 */
public class A057021 extends A057020 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
