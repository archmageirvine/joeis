package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069754 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mTransitions = 0;
  private boolean mIsPrime = false;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN) != mIsPrime) {
      mIsPrime = !mIsPrime;
      ++mTransitions;
    }
    return Z.valueOf(mTransitions);
  }
}
