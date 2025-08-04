package irvine.oeis.a386;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A386626 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386626 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  /** Construct the sequence. */
  public A386626() {
    super(4);
  }

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    ++mN;
    Q min = new Q(mN);
    Q best = null;
    for (long m = 1; m < 2 * mN; ++m) {
      final Q v = new Q(m, mN);
      for (long p = 1; p < 2 * mN; p = mPrime.nextPrime(p)) {
        for (long q = 2; q < 2 * mN; q = mPrime.nextPrime(q)) {
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
