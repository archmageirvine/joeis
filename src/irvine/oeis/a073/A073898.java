package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073898 a(1) = 1; for n&gt;1, a(n) = smallest even or odd number not occurring earlier accordingly as n is prime or composite.
 * @author Sean A. Irvine
 */
public class A073898 extends Sequence1 {

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
      mEven += 2;
      return Z.valueOf(mEven);
    } else {
      mOdd += 2;
      return Z.valueOf(mOdd);
    }
  }
}

