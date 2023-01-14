package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A061002 As p runs through the primes &gt;= 5, sequence gives { numerator of Sum_{k=1..p-1} 1/k } / p^2.
 * @author Sean A. Irvine
 */
public class A061002 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private Q mSum = Q.ZERO;
  private long mP = 0;
  private long mM = 1;

  {
    next();
    next();
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mM < mP) {
      mSum = mSum.add(new Q(1, mM));
      ++mM;
    }
    return mSum.num().divide(mP).divide(mP);
  }
}
