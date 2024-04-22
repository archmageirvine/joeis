package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065914 Number of primes in the interval [ 1/2 * q(n), 3/2 * q(n) - 1 ] where q(n) is prime(n)#, the n-th primorial.
 * @author Sean A. Irvine
 */
public class A065914 extends A002110 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return Functions.PRIME_PI.z(q.multiply(3).divide2().subtract(1)).subtract(Functions.PRIME_PI.z(q.divide2().subtract(1)));
  }
}
