package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073101 extends Sequence1 {

  // After Robert Israel

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1 + mN / 4; x < (3 * mN + 3) / 4; ++x) {
      final Q t = new Q(4, mN).subtract(new Q(1, x));
      final long p = t.num().longValueExact();
      final long q = t.den().longValueExact();
      for (final Z dd : Jaguar.factor(q * q).divisors()) {
        final long d = dd.longValue();
        if (d < q && (d + q) % p == 0) {
          final long y = (d + q) / p;
          if (y > x) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
