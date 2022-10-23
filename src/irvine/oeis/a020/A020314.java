package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020314 Strong pseudoprimes to base 88.
 * @author Sean A. Irvine
 */
public class A020314 extends Sequence1 {

  private Z mN = Z.valueOf(85);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(88L, mN)) {
        return mN;
      }
    }
  }
}
