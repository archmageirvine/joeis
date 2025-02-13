package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075248 Number of solutions (x,y,z) to 5/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A075248 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1 + mN / 5; x < (4 * mN + 4) / 5; ++x) {
      final Q t = new Q(5, mN).subtract(new Q(1, x));
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
