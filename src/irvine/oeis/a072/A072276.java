package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001262 Strong pseudoprimes to base 2.
 * @author Sean A. Irvine
 */
public class A072276 extends Sequence1 {

  private Z mN = Z.valueOf(1373651);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(2L, mN) && ZUtils.sprpTest(3L, mN)) {
        return mN;
      }
    }
  }
}
