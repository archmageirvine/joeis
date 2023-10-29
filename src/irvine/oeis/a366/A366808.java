package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a057.A057588;

/**
 * A366808 The number of divisors of prime(n)#-1 where p# is the product of all the primes from 2 to p inclusive.
 * @author Sean A. Irvine
 */
public class A366808 extends A057588 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
