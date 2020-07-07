package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033447 Initial prime in set of 4 consecutive primes with common difference 12.
 * @author Sean A. Irvine
 */
public class A033447 extends A033446 {

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is4(mP)) {
        return mP;
      }
    }
  }
}

