package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052130 a(n) is the number of numbers between 1 and 2^m with m-n prime factors (counted with multiplicity), for m sufficiently large.
 * @author Sean A. Irvine
 */
public class A052130 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mLimit = 0;
  private long mCount = 0;

  private void search(final long product, final long p, final long remaining) {
    if (remaining == 0) {
      ++mCount;
      return;
    }
    for (long q = p, r; (r = product * q) <= mLimit; q = mPrime.nextPrime(q)) {
      search(r, q, remaining - 1);
    }
  }

  @Override
  public Z next() {
    final int m = CR.THREE.log().multiply(++mN).divide(CR.valueOf(new Q(3, 2)).log()).floor().intValue();
    mLimit = 1L << m;
    mCount = 0;
    search(1, 2, m - mN);
    return Z.valueOf(mCount);
  }
}
