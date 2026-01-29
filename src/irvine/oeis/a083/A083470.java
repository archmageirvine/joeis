package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083470 Smallest prime which is the concatenation of n distinct primes in increasing order.
 * @author Sean A. Irvine
 */
public class A083470 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mMin = null;

  private Z toZ(final long[] s) {
    final StringBuilder sb = new StringBuilder();
    for (final long v : s) {
      sb.append(v);
    }
    return new Z(sb);
  }

  private void search(final long[] s, final int pos, final long p) {
    if (pos == s.length) {
      final Z t = toZ(s);
      if ((mMin == null || t.compareTo(mMin) < 0) && t.isProbablePrime()) {
        mMin = t;
      }
      return;
    }
    long q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      long r = q;
      for (int j = pos; j < s.length; ++j) {
        // Fill remaining elements as sequential primes (effective lower bound)
        s[j] = r;
        r = mPrime.nextPrime(r);
      }
      final Z t = toZ(s);
      if (mMin == null || t.compareTo(mMin) <= 0) {
        search(s, pos + 1, q);
      } else {
        break;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMin = null;
    search(new long[mN], 0, 1);
    return mMin;
  }
}
