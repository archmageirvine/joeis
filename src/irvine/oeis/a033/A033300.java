package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033300 Smallest safe prime ((p-1)/2 is also prime) &gt; n-th prime.
 * @author Sean A. Irvine
 */
public class A033300 extends A000040 {

  {
    setOffset(0);
  }

  private Z mN = Z.ZERO;
  private Z mSafePrime = Z.ZERO;

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    while (mSafePrime.compareTo(mN) <= 0) {
      do {
        mSafePrime = super.next();
      } while (!mSafePrime.divide2().isProbablePrime());
    }
    return mSafePrime;
  }
}

