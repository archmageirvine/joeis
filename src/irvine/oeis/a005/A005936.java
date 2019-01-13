package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005936.
 * @author Sean A. Irvine
 */
public class A005936 implements Sequence {

  private long mN = 3;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(5, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
