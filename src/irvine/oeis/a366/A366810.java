package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a057.A057588;

/**
 * A366810 a(n) = phi(prime(n)#-1) where phi is the Euler totient function and p# is the product of all the primes from 2 to p inclusive.
 * @author Sean A. Irvine
 */
public class A366810 extends A057588 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
