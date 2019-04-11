package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007693 Numbers n such that n and <code>6n+1</code> are primes.
 * @author Sean A. Irvine
 */
public class A007693 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(6 * mP + 1)) {
        return Z.valueOf(mP);
      }
    }
  }
}
