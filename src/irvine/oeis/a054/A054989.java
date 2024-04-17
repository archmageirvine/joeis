package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a057.A057588;

/**
 * A054989 Number of prime divisors of -1 + (product of first n primes).
 * @author Sean A. Irvine
 */
public class A054989 extends A057588 {

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
