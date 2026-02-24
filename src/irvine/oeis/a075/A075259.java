package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075259 Number of solutions (x,y,z) to 3/(2n+1) = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z and odd x, y, z.
 * @author Sean A. Irvine
 */
public class A075259 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    final Q r = new Q(3, mN);
    for (long x = (1 + mN / 4) | 1; x < (3 * mN + 2) / 3; x += 2) {
      final Q t = r.subtract(new Q(1, x));
      if (!t.isZero()) {
        final long lim = Q.TWO.divide(t).toZ().longValueExact();
        for (long y = (Math.max(t.reciprocal().toZ().longValueExact(), x) + 1) | 1; y < lim; y += 2) {
          final Q u = t.subtract(new Q(1, y));
          if (u.num().isOne()) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
