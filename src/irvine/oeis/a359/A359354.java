package irvine.oeis.a359;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A359354 Position of the first subsequence of n primes that differs from the first n primes, but where the relative distances among their elements coincide with those of the subsequence of first n primes except for a scale factor.
 * @author Sean A. Irvine
 */
public class A359354 extends A001223 {

  private static final int MAX = 100; // Way more than we can ever find with this code
  private final long[] mGaps = new long[MAX];
  private int mN = -1;
  private long mP = 3;
  private long mPi = 2;
  private final Fast mPrime = new Fast();

  private boolean is() {
    if (mN < 2) {
      return true;
    }
    long q = mP;
    long r = mPrime.nextPrime(q);
    final long s = r - q;
    for (int k = 1; k < mN; ++k) {
      q = r;
      r = mPrime.nextPrime(q);
      if (r - q != s * mGaps[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mGaps[++mN] = super.next().longValueExact();
    while (!is()) {
      mP = mPrime.nextPrime(mP);
      ++mPi;
    }
    return Z.valueOf(mPi);
  }
}
