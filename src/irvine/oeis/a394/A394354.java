package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A394354 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394354 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  protected Z select(final Q pq, final Q mn) {
    //System.out.println(pq + " " + mn);
    return pq.den();
  }

  private long prev(final long p) {
    return p == 2 ? 1 : mPrime.prevPrime(p);
  }

  @Override
  public Z next() {
    ++mN;
    Q min = new Q(mN);
    Q best = null;
    Q bestv = null;
    for (long m = mN - 1; m > 0; --m) {
      final Q v = new Q(m, mN);
      for (long q = mPrime.prevPrime(mN); q > 1; q = mPrime.prevPrime(q)) {
        for (long p = mPrime.prevPrime(mN); p > 0; p = prev(p)) {
          final Q r = new Q(p, q);
          final Q u = v.subtract(r).abs();
          if (!u.isZero()) {
            final int c = u.compareTo(min);
            if (c < 0) {
              min = u;
              best = r;
              bestv = v;
            }
          }
        }
      }
    }
    return select(best, bestv);
  }
}
