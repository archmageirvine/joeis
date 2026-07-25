package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086103 Primes appearing as the concatenation of the last two digits of prime(A086102(n)) and the first two digits of prime(A086102(n)+1).
 * @author Sean A. Irvine
 */
public class A086103 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(Z.TEN) > 0) {
        final String q = mPrime.nextPrime(p).toString();
        final long t = p.mod(100) * 100 + Long.parseLong(q.substring(0, 2));
        if (mPrime.isPrime(t)) {
          return Z.valueOf(t);
        }
      }
    }
  }
}

