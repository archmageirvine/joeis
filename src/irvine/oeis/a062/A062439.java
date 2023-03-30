package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062439 Primes at large indices: a(n) = prime(n!).
 * @author Sean A. Irvine
 */
public class A062439 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mF = 1;
  private long mP = 2;
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.TWO;
    }
    if (mN > 20) {
      throw new UnsupportedOperationException();
    }
    mF *= mN;
    while (mM < mF) {
      ++mM;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
