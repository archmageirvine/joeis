package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071367 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mTerms;
  private long mN = 1;

  A071367(final int terms) {
    mTerms = terms;
  }

  /** Construct the sequence. */
  public A071367() {
    this(5);
  }

  private boolean is(final long n, final long m, final int used) {
    if (m > mTerms) {
      return true;
    }
    for (long k = 0; k < mTerms; ++k) {
      final long v = n + k;
      if (v % m == 0 && (used & (1 << k)) == 0 && mPrime.isPrime(v / m) && is(n, m + 1, used | (1 << k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, 1, 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
