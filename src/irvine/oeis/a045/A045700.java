package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045700 Primes of form p^2+q^3 where p and q are primes.
 * @author Sean A. Irvine
 */
public class A045700 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final long n = prime.longValueExact();
      for (long q2, p = 2; (q2 = n - p * p * p) >= 4; p = mPrime.nextPrime(p)) {
        final long q = Functions.SQRT.l(q2);
        if (q * q == q2 && mPrime.isPrime(q)) {
          return prime;
        }
      }
    }
  }
}
