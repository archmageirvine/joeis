package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020252 Strong pseudoprimes to base 26.
 * @author Sean A. Irvine
 */
public class A020252 extends Sequence1 {

  private Z mN = Z.SEVEN;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(26L, mN)) {
        return mN;
      }
    }
  }
}
