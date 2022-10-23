package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020271 Strong pseudoprimes to base 45.
 * @author Sean A. Irvine
 */
public class A020271 extends Sequence1 {

  private Z mN = Z.valueOf(479);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(45L, mN)) {
        return mN;
      }
    }
  }
}
