package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073101 Number of integer solutions (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A075260 extends Sequence2 {

  private long mN = 3;

  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(x);
  }

  @Override
  public Z next() {
    mN += 2;
    final Q r = new Q(3, mN);
    for (long x = (1 + mN / 4) | 1; x < (3 * mN + 2) / 3; x += 2) {
      final Q t = r.subtract(new Q(1, x));
      if (!t.isZero()) {
        final long lim = Q.TWO.divide(t).toZ().longValueExact();
        for (long y = (Math.max(t.reciprocal().toZ().longValueExact(), x) + 1) | 1; y < lim; y += 2) {
          final Q u = t.subtract(new Q(1, y));
          if (u.num().equals(Z.ONE)) {
            return select(x, y, u.reciprocal().toZ().longValueExact());
          }
        }
      }
    }
    throw new RuntimeException();
  }
}
