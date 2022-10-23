package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A006945 Smallest odd number that requires n Miller-Rabin primality tests.
 * @author Sean A. Irvine
 */
public class A006945 extends Sequence1 {

  // This is too slow to get more than a few terms.

  private final Fast mPrime = new Fast();
  private int mN = -1;
  private Z mM = Z.NINE;

  private boolean test(final Z m, final int n) {
    long p = 2;
    for (int k = 0; k < n; ++k, p = mPrime.nextPrime(p)) {
      if (!ZUtils.sprpTest(p, m)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (test(mM, mN) && !mM.isPrime()) {
        return mM;
      }
      mM = mM.add(2);
    }
  }
}
