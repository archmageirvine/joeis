package irvine.oeis.a386;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A386626 a(n) = denominator q of prime-fraction p/q that minimizes |m/n - p/q|&gt;0, where p is 1 or prime, q is prime, q &lt; 2n, and 1 &lt;= m &lt;= 2n-1.
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
      if (Functions.GCD.l(mN, m) == 1) {
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
    }
    return select(best);
  }
}
