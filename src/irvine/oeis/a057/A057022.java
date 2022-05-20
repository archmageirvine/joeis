package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057022 a(n) = floor((sum of divisors of n) / (number of divisors of n)), or floor(sigma_1(n)/sigma_0(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A057022 extends A057020 {

  @Override
  protected Z select(final Q n) {
    return n.toZ();
  }
}
