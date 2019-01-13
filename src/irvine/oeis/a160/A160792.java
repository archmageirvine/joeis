package irvine.oeis.a160;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A160792.
 * @author Sean A. Irvine
 */
public class A160792 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mPrimeSum = Z.ZERO;
  private Z mPrimeValue = Z.ONE;
  private Z mPrev = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    final Z s;
    if ((++mN & 1) == 0) {
      if (mN > 0) {
        mPrimeValue = mPrime.nextPrime(mPrimeValue);
        mPrimeSum = mPrimeSum.add(mPrimeValue);
      }
      s = mPrev.add(mPrimeSum);
    } else {
      s = mPrev.add(mN / 2 + 1);
    }
    mPrev = s;
    return s;
  }
}

