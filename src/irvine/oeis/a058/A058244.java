package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058244 11^n-th prime.
 * @author Sean A. Irvine
 */
public class A058244 implements Sequence {

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
    mN *= 11;
    return Z.valueOf(mP);
  }
}
