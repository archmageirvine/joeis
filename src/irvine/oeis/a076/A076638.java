package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076638 Denominators of harmonic numbers when the numerators are divisible by squares of primes &gt;= 5 in the case of Wolstenholme's Theorem.
 * @author Sean A. Irvine
 */
public class A076638 extends Sequence1 {

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
    return mSum.den();
  }
}
