package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039998 Primes embedded in prime(n).
 * @author Sean A. Irvine
 */
public class A039998 extends A039999 {

  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return count(mP);
  }
}

