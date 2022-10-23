package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020282 Strong pseudoprimes to base 56.
 * @author Sean A. Irvine
 */
public class A020282 extends Sequence1 {

  private Z mN = Z.valueOf(53);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(56L, mN)) {
        return mN;
      }
    }
  }
}
