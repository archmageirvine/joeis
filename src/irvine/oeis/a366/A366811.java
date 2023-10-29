package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A366811 The number of divisors of prime(n)#+1 where p# is the product of all the primes from 2 to p inclusive.
 * @author Sean A. Irvine
 */
public class A366811 extends A006862 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
