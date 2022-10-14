package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059875 The lexicographically last sequence of binary encodings of solutions satisfying the equation given in A059871.
 * @author Sean A. Irvine
 */
public class A059875 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mN = 0;

  private long search(final long sum, final long p, final long k, final long pattern) {
    if (k == 0) {
      if (sum == 0) {
        return pattern;
      }
      return 0;
    }
    final long q = Math.max(mPrime.prevPrime(p), 1); // Take p_0=1
    final long a = search(sum + q, q, k - 1, (pattern << 1) + 1);
    if (a > 0) {
      return a;
    }
    return search(sum - q, q, k - 1, pattern << 1);
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException("Need to move pattern from long -> Z");
    }
    final long q = mP;
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(search(q * (1 + (mN & 1)) - mP, q, mN - 1, 1L));
  }
}
