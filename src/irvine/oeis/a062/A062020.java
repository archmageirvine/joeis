package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062020 a(n) = Sum_{i=1..n} Sum_{j=1..i} (prime(i) - prime(j)).
 * @author Sean A. Irvine
 */
public class A062020 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mSumP = Z.FIVE;
  private long mN = 2;
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (mA.isZero()) {
      mA = Z.ONE;
    } else {
      mP = mPrime.nextPrime(mP);
      mSumP = mSumP.add(mP);
      mA = mA.add(mP.multiply(++mN)).subtract(mSumP);
    }
    return mA;
  }
}

