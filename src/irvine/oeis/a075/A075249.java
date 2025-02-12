package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A073101 Number of integer solutions (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A075249 extends Sequence3 {

  // Note this does not seem to quite match the name.
  // For n=11, I find (4,5,220) as the largest solution, (3,9,99) seems to be the first solution

  private long mN = 2;

  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(x);
  }

  @Override
  public Z next() {
    ++mN;
    Q c = Q.ONE;
    for (long x = 1 + mN / 5; x < (4 * mN + 4) / 5; ++x) {
      final Q t = new Q(5, mN).subtract(new Q(1, x));
      final long lim = Q.TWO.divide(t).toZ().longValueExact();
      for (long y = Math.max(t.reciprocal().toZ().longValueExact(), x) + 1; y < lim; ++y) {
        if (t.subtract(new Q(1, y)).compareTo(c) >= 0) {
          break;
        }
        final Q u = t.subtract(new Q(1, y));
        if (u.num().equals(Z.ONE)) {
          c = u;
          return select(x, y, c.reciprocal().toZ().longValueExact()); // temp
        }
      }
    }
    throw new RuntimeException();
    //return select(a, b, c.reciprocal().toZ().longValueExact());
  }
}
