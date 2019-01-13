package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005381.
 * @author Sean A. Irvine
 */
public class A005381 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN) && !mPrime.isPrime(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
