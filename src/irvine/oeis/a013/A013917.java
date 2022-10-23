package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013917 a(n) is prime and sum of all primes &lt;= a(n) is prime.
 * @author Sean A. Irvine
 */
public class A013917 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mPrime.isPrime(mSum)) {
        return mP;
      }
    }
  }
}
