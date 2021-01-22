package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038580 Primes with indices that are primes with prime indices.
 * @author Sean A. Irvine
 */
public class A038580 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP0 = 0;
  private long mP1 = 0;
  private long mPi1 = 0;
  private long mP2 = 0;
  private long mPi2 = 0;

  @Override
  public Z next() {
    mP0 = mPrime.nextPrime(mP0);
    while (mPi1 < mP0) {
      mP1 = mPrime.nextPrime(mP1);
      ++mPi1;
    }
    while (mPi2 < mP1) {
      mP2 = mPrime.nextPrime(mP2);
      ++mPi2;
    }
    return Z.valueOf(mP2);
  }
}
