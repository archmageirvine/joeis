package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039996 Number of distinct primes embedded in prime(n) as substrings.
 * @author Sean A. Irvine
 */
public class A039996 extends A039997 {

  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return count(mP);
  }
}

