package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020320 Strong pseudoprimes to base 94.
 * @author Sean A. Irvine
 */
public class A020320 extends Sequence1 {

  private Z mN = Z.valueOf(91);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(94L, mN)) {
        return mN;
      }
    }
  }
}
