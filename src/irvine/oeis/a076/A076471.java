package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076471 Number of pairs (p,q) of successive primes with p+q&lt;=n.
 * @author Sean A. Irvine
 */
public class A076471 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mCount = Z.ZERO;
  private long mP = 2;
  private long mS = 5;

  @Override
  public Z next() {
    if (++mN == mS) {
      mCount = mCount.add(1);
      mP = mPrime.nextPrime(mP);
      mS = mP + mPrime.nextPrime(mP);
    }
    return mCount;
  }
}
