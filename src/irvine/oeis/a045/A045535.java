package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A045535 Least negative pseudosquare modulo the first n odd primes.
 * @author Sean A. Irvine
 */
public class A045535 extends Sequence0 {

  // After M. F. Hasler

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private Z mM = Z.SEVEN;

  private boolean is(final long n, final Z m) {
    for (long p = 3, k = 0; k < n; p = mPrime.nextPrime(p), ++k) {
      if (m.mod(p) == 0) {
        return false;
      }
      if (!ZUtils.isQuadraticResidue(m.negate(), Z.valueOf(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mN, mM)) {
      mM = mM.add(8);
    }
    return mM;
  }
}
