package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074719 ip(n): the number of primes not exceeding reverse(n).
 * @author Sean A. Irvine
 */
public class A074719 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME_PI.z(Functions.REVERSE.l(++mN));
  }
}
