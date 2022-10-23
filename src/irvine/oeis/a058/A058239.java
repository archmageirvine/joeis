package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058239 (7^n)-th prime.
 * @author Sean A. Irvine
 */
public class A058239 extends Sequence0 {

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
    mN *= 7;
    return Z.valueOf(mP);
  }
}
