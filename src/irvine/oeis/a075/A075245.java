package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A075245 x-value of the solution (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z and having the largest z-value. The y and z components are in A075246 and A075247.
 * @author Sean A. Irvine
 */
public class A075245 extends Sequence3 {

  // After M. F. Hasler

  private long mN = 2;

  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(x);
  }

  @Override
  public Z next() {
    ++mN;
    Q c = Q.ONE;
    long a = 0;
    long b = 0;
    final Q r = new Q(4, mN);
    for (long x = 1 + mN / 4; x < (3 * mN + 3) / 4; ++x) {
      final Q t = r.subtract(new Q(1, x));
      final long lim = Q.TWO.divide(t).toZ().longValueExact();
      for (long y = Math.max(t.reciprocal().toZ().longValueExact(), x) + 1; y < lim; ++y) {
        if (t.subtract(new Q(1, y)).compareTo(c) >= 0) {
          break;
        }
        final Q u = t.subtract(new Q(1, y));
        if (u.num().equals(Z.ONE)) {
          c = u;
          a = x;
          b = y;
        }
      }
    }
    return select(a, b, c.reciprocal().toZ().longValueExact());
  }
}
