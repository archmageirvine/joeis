package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073897 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mEven = 0;
  private long mOdd = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      mOdd += 2;
      return Z.valueOf(mOdd);
    } else {
      mEven += 2;
      return Z.valueOf(mEven);
    }
  }
}

