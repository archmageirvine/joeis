package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020289.
 * @author Sean A. Irvine
 */
public class A020289 implements Sequence {

  private Z mN = Z.valueOf(527);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(63L, mN)) {
        return mN;
      }
    }
  }
}
