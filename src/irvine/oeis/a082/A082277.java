package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a070.A070281;

/**
 * A082277 Smallest prime that is the sum of prime(n) consecutive primes.
 * @author Sean A. Irvine
 */
public class A082277 extends A070281 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mPrime.isPrime(mN)) {
        return t;
      }
    }
  }
}
