package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013916 Numbers k such that the sum of the first k primes is prime.
 * @author Sean A. Irvine
 */
public class A013916 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mPrime.isPrime(mSum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
