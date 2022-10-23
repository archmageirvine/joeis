package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058248 Number of primes &lt;= 12^n.
 * @author Sean A. Irvine
 */
public class A058248 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mLimit = 1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    while (mP <= mLimit) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mLimit *= 12;
    return Z.valueOf(mCount - 1);
  }
}
