package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069691 Smallest prime with internal digits = n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069691 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mA = 10;

  @Override
  public Z next() {
    if (++mN >= mA) {
      mA *= 10;
    }
    for (long a = 1; a <= 9; ++a) {
      final long t = (a * mA + mN) * 10;
      if (mPrime.isPrime(t + 1)) {
        return Z.valueOf(t + 1);
      }
      if (mPrime.isPrime(t + 3)) {
        return Z.valueOf(t + 3);
      }
      if (mPrime.isPrime(t + 7)) {
        return Z.valueOf(t + 7);
      }
      if (mPrime.isPrime(t + 9)) {
        return Z.valueOf(t + 9);
      }
    }
    return Z.ZERO;
  }
}
