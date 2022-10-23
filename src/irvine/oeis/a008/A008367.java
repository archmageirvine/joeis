package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008367 Composite but smallest prime factor &gt;= 17.
 * @author Sean A. Irvine
 */
public class A008367 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 287;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 3 != 0 && mN % 5 != 0 && mN % 7 != 0 && mN % 11 != 0 && mN % 13 != 0 && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}


