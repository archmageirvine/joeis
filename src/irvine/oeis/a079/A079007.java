package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A079007 a(n) = smallest prime p_k such that the n successive differences between the primes p_k through p_(k+n) are all distinct.
 * @author Sean A. Irvine
 */
public class A079007 extends Sequence0 {

  // Sequence is monotonic increasing, so we can continue from previous result

  private final LongDynamicLongArray mSeen = new LongDynamicLongArray(); // used as a set
  private final Fast mPrime = new Fast();
  private int mN = -1;
  private long mId = 0;
  private long mP = 2;

  private boolean is(final long p, final int n) {
    ++mId; // used to mark in set and avoid reallocation etc.
    long q = p;
    for (int k = 0; k < n; ++k) {
      final long r = q;
      q = mPrime.nextPrime(q);
      if (mSeen.get(q - r) == mId) {
        return false;
      }
      mSeen.set(q - r, mId);
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN)) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
