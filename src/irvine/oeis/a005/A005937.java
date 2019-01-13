package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005937.
 * @author Sean A. Irvine
 */
public class A005937 implements Sequence {

  private long mN = 33;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(6, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
