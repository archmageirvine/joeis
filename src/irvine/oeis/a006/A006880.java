package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006880 Number of primes <code>&lt; 10^n</code>.
 * @author Sean A. Irvine
 */
public class A006880 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mLimit = 1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    while (mP < mLimit) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mLimit *= 10;
    return Z.valueOf(mCount - 1);
  }
}
