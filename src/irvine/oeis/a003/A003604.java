package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003604 Number of primes &lt;= n!.
 * @author Sean A. Irvine
 */
public class A003604 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mF = Z.ONE;
  private int mN = -1;
  private Z mP = Z.TWO;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    while (mP.compareTo(mF) <= 0) {
      mCount = mCount.add(1);
      mP = mPrime.nextPrime(mP);
    }
    return mCount;
  }
}
