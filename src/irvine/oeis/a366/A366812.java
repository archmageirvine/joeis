package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A366812 The sum of the divisors of prime(n)#+1 where p# is the product of all the primes from 2 to p inclusive.
 * @author Sean A. Irvine
 */
public class A366812 extends A006862 {

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}
