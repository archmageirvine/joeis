package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033300 Smallest safe prime <code>((p-1)/2</code> is also prime) <code>&gt; n-th</code> prime.
 * @author Sean A. Irvine
 */
public class A033300 extends A000040 {

  private Z mN = Z.ZERO;
  private Z mSafePrime = Z.ZERO;

  @Override
  public Z next() {
    mN = mFast.nextPrime(mN);
    while (mSafePrime.compareTo(mN) <= 0) {
      do {
        mSafePrime = super.next();
      } while (!mSafePrime.divide2().isProbablePrime());
    }
    return mSafePrime;
  }
}

