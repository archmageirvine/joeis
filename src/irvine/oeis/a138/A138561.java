package irvine.oeis.a138;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138561 Start with the list {1}; for each n &gt;= 1, append p(n) primes followed by c(n) composite numbers, where p(n) is the n-th prime and c(n) is the n-th composite number.
 * @author Sean A. Irvine
 */
public class A138561 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mC = Z.ZERO;
  private Z mPP = Z.ONE;
  private Z mCC = Z.ONE;
  private boolean mComposites = true;
  private Z mCount = Z.ONE;

  private Z nextComposite(Z c) {
    do {
      c = c.add(1);
    } while (mPrime.isPrime(c));
    return c;
  }

  @Override
  public Z next() {
    if (!mCount.isZero()) {
      mCount = mCount.subtract(Z.ONE);
      if (mComposites) {
        mC = nextComposite(mC);
        return mC;
      } else {
        mP = mPrime.nextPrime(mP);
        return mP;
      }
    }
    mComposites = !mComposites;
    if (mComposites) {
      mCC = nextComposite(mCC);
      mCount = mCC;
    } else {
      mPP = mPrime.nextPrime(mPP);
      mCount = mPP;
    }
    return next();
  }
}

