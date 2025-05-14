package irvine.oeis.a383;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383489.
 * @author Sean A. Irvine
 */
public class A383641 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mSum = Z.ONE; // to compensate for 1

  @Override
  public Z next() {
    if (!mPrime.isPrime(++mN)) {
      mSum = mSum.signedAdd((mN & 1) == 0, Z.valueOf(mN));
    }
    return mSum;
  }
}

