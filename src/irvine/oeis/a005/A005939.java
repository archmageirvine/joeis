package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005939 Pseudoprimes to base 10.
 * @author Sean A. Irvine
 */
public class A005939 extends Sequence1 {

  private long mN = 7;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(10, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
