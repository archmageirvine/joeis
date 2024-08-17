package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071829.
 * @author Sean A. Irvine
 */
public class A071842 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if ((++mN & 7) == 7 && mPrime.isPrime(mN)) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
