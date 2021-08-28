package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051169 Smallest number m such that 2*m - p is composite for the first n primes p.
 * @author Sean A. Irvine
 */
public class A051169 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mM = 3;

  private boolean is(final long m, final int n) {
    long p = 2;
    for (int k = 0; k < n; ++k, p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(2 * m - p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
