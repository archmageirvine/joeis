package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073650 Define the composite field of a prime q to be f(q) = (t,s) if p, q, r are three consecutive primes and q-p = t and r-q = s. This is a sequence of primes q with field (2,6).
 * @author Sean A. Irvine
 */
public class A073650 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).subtract(p).equals(Z.SIX) && p.subtract(mPrime.prevPrime(p)).equals(Z.TWO)) {
        return p;
      }
    }
  }
}
