package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055731 Number of primes &lt; 6^n.
 * @author Sean A. Irvine
 */
public class A055731 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mLimit = 1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    while (mP <= mLimit) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mLimit *= 6;
    return Z.valueOf(mCount - 1);
  }
}
