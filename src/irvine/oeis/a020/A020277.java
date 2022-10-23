package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020277 Strong pseudoprimes to base 51.
 * @author Sean A. Irvine
 */
public class A020277 extends Sequence1 {

  private Z mN = Z.valueOf(23);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(51L, mN)) {
        return mN;
      }
    }
  }
}
