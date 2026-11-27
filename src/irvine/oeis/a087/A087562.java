package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087562 Primes such that the next n successive differences are identical.
 * @author Sean A. Irvine
 */
public class A087562 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 1;
  private long mM = 0;
  private long mD = 1;

  private boolean is(final long p, final long d, final long n) {
    long q = p;
    for (long k = 0; k < n; ++k) {
      q += d;
      if (!mPrime.isPrime(q)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mP == 1) {
      mP = 2;
      return Z.TWO;
    }
    if (++mM > mN) {
      ++mN;
      mD = mN > 6 ? 30 : 2;
      while (!is(mP, mD, mN)) {
        mD += 2;
      }
      mM = 1;
    }
    mP += mD;
    return Z.valueOf(mP);
  }
}
