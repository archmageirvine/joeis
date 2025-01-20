package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074267 Primes of form p^n + k, where p is prime, n&gt;1 and 0&lt;k&lt;p.
 * @author Sean A. Irvine
 */
public class A074267 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z candidate = super.next();
      final long n = candidate.longValueExact();
      long p = 1;
      while (true) {
        p = mPrime.nextPrime(p);
        long q = p * p;
        if (q > n) {
          break;
        }
        while (q <= n) {
          if (n - q < p) {
            return candidate;
          }
          q *= p;
        }
      }
    }
  }
}
