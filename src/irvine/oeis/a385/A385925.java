package irvine.oeis.a385;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A385925 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385925 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    ++mN;
    Q min = new Q(mN);
    Q best = null;
    for (long m = 1; m < mN; ++m) {
      final Q v = new Q(m, mN);
      for (long p = 1; p < mN; p = mPrime.nextPrime(p)) {
        for (long q = 2; q < mN; q = mPrime.nextPrime(q)) {
          final Q r = new Q(p, q);
          final Q u = v.subtract(r).abs();
          if (!u.isZero() && u.compareTo(min) < 0) {
            min = u;
            best = r;
          }
        }
      }
    }
    return select(best);
  }
}
