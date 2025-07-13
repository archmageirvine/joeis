package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383594 a(0) = 0 and thereafter a(n) = 2 if a(n-1) is an odd prime, otherwise a(n) = a(n-1) + k where k = n - P(n) and P(n) is the number of odd primes among terms a(0),...,a(n-1).
 * @author Sean A. Irvine
 */
public class A383594 extends Sequence0 {

  private long mOddPrimeCount = 0;
  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mA.isOdd() && mA.isProbablePrime()) {
        mA = Z.TWO;
      } else {
        mA = mA.add(mN - mOddPrimeCount);
        if (mA.isOdd() && mA.isProbablePrime()) {
          ++mOddPrimeCount;
        }
      }
    }
    return mA;
  }
}
