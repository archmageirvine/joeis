package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039994 Number of primes embedded in decimal expansion of prime(n) as substrings.
 * @author Sean A. Irvine
 */
public class A039994 extends A039995 {

  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return count(mP);
  }
}

