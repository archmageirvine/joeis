package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058192 (6^n)-th prime.
 * @author Sean A. Irvine
 */
public class A058192 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    while (mCount < mN) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mN *= 6;
    return Z.valueOf(mP);
  }
}
