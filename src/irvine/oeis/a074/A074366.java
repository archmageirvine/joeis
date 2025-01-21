package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a019.A019518;

/**
 * A074366 The first prime greater than the concatenation of the first n primes.
 * @author Sean A. Irvine
 */
public class A074366 extends A019518 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
