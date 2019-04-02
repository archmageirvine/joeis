package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005384 Sophie Germain primes p: 2p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A005384 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.multiply2().add(1))) {
        return mP;
      }
    }
  }
}
