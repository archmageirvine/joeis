package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064961 Composite-then-prime recurrence; a(2n) = a(2n-1)-th composite and a(2n+1) = a(2n)-th prime and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A064961 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private long mPrimeCount = 0;
  private long mN = 1;
  private boolean mEven = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final long a = mA.longValueExact();
    mEven = !mEven;
    while (true) {
      if (mPrime.isPrime(++mN)) {
        ++mPrimeCount;
      }
      if (mEven) {
        if (mPrimeCount == a) {
          mA = Z.valueOf(mN);
          break;
        }
      } else {
        if (mN - mPrimeCount - 1 == a) {
          mA = Z.valueOf(mN);
          break;
        }
      }
    }
    return mA;
  }
}
