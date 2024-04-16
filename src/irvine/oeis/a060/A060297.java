package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060297 Periodic part of decimal expansion of n / next prime &gt; n.
 * @author Sean A. Irvine
 */
public class A060297 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q q = new Q(++mN, mPrime.nextPrime(mN));
      Z t = Z.ONE;
      while (true) {
        t = t.multiply(10);
        final Q r = q.multiply(t);
        final Z a = r.toZ();
        final Q b = r.subtract(a);
        if (b.isZero()) {
          return Z.ZERO;
        }
        if (new Q(a, t.subtract(1)).equals(q)) {
          if (a.compareTo(mN) > 0) {
            return a;
          } else {
            break;
          }
        }
      }
    }
  }
}
