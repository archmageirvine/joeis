package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036570 Primes p such that (p+1)/2 and (p+2)/3 are also primes.
 * @author Sean A. Irvine
 */
public class A036570 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 11;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime((mP + 1) / 2) && mPrime.isPrime((mP + 2) / 3)) {
        return Z.valueOf(mP);
      }
    }
  }
}
