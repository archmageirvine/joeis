package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A056915 Strong pseudoprimes to bases 2, 3 and 5, i.e., intersection of A001262, A020229, and A020231.
 * @author Sean A. Irvine
 */
public class A056915 extends Sequence1 {

  private Z mN = Z.valueOf(25325999);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(2L, mN) && ZUtils.sprpTest(3L, mN) && ZUtils.sprpTest(5L, mN)) {
        return mN;
      }
    }
  }
}
