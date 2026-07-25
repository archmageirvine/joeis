package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086104 Primes appearing as concatenation of the last digit of Prime[A086101(n)] and the first digit of Prime[A086101(n)+1].
 * @author Sean A. Irvine
 */
public class A086104 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String q = mPrime.nextPrime(p).toString();
      final long t = p.mod(10) * 10 + q.charAt(0) - '0';
      if (mPrime.isPrime(t)) {
        return Z.valueOf(t);
      }
    }
  }
}

