package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074831 Number of binary reversal primes less than 10^n.
 * @author Sean A. Irvine
 */
public class A074831 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mLim = 1;
  private long mP = 3;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim *= 10;
    while (mP < mLim) {
      if (mPrime.isPrime(Functions.REVERSE.l(2, mP))) {
        ++mCount;
      }
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mCount);
  }
}
