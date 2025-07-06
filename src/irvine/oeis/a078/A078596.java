package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078596 Numbers m such that there is at least one pair (x,y) 1 &lt;= x &lt;= y &lt;= m such that 1/x + 1/y + 1/m = 1/phi(m).
 * @author Sean A. Irvine
 */
public class A078596 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q t = new Q(1, Functions.PHI.l(++mN)).subtract(new Q(1, mN));
      for (long x = 1; x <= mN; ++x) {
        final Q u = t.subtract(new Q(1, x));
        if (u.signum() > 0 && u.num().isOne()) {
          final Z v = u.den();
          if (v.bitLength() < Long.SIZE) {
            final long y = v.longValue();
            if (y >= x && y <= mN) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

