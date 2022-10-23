package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A059955 a(n) = floor( prime(n)!/lcm(1..prime(n)) ) modulo prime(n).
 * @author Sean A. Irvine
 */
public class A059955 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private Z mF = Z.TWO;
  private Z mLcm = Z.TWO;

  @Override
  public Z next() {
    final long q = mPrime.nextPrime(mP);
    for (long k = mP + 1; k <= q; ++k) {
      mF = mF.multiply(k);
      mLcm = mLcm.lcm(Z.valueOf(k));
    }
    mP = q;
    return mF.divide(mLcm).mod(Z.valueOf(mP));
  }
}
