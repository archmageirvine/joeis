package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020284 Strong pseudoprimes to base 58.
 * @author Sean A. Irvine
 */
public class A020284 implements Sequence {

  private Z mN = Z.valueOf(55);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && ZUtils.sprpTest(58L, mN)) {
        return mN;
      }
    }
  }
}
