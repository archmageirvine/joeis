package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391800 Primes indexed by A391797.
 * @author Sean A. Irvine
 */
public class A391800 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final long q = mPrime.nextPrime(mP);
      mP = mPrime.nextPrime(q); // p(2k)
      final long r = mPrime.nextPrime(mP);
      if (mPrime.nextPrime(r) - mP < r - q) {
        return Z.valueOf(mN);
      }
    }
  }
}
