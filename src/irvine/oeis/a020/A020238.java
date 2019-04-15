package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020238 Strong pseudoprimes to base 12.
 * @author Sean A. Irvine
 */
public class A020238 implements Sequence {

  private Z mN = Z.valueOf(189);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(12L, mN)) {
        return mN;
      }
    }
  }
}
