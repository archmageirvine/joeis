package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073681 Smallest of three consecutive primes whose sum is a prime.
 * @author Sean A. Irvine
 */
public class A073681 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (mPrime.nextPrime(q).add(q).add(p).isProbablePrime()) {
        return p;
      }
    }
  }
}
