package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025584 Primes p such that p-2 is not a prime.
 * @author Sean A. Irvine
 */
public class A025584 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!mPrime.isPrime(mP - 2)) {
        return Z.valueOf(mP);
      }
    }
  }
}
