package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066759 a(n) = least multiple of n differing from a prime by at most 1, if such a multiple exists; = 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066759 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    long m = mN;
    while (true) {
      if (mPrime.isPrime(m + 1) || mPrime.isPrime(m - 1)) {
        return Z.valueOf(m);
      }
      m += mN;
    }
  }
}

