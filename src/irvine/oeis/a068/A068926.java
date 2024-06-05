package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068926 Table read by antidiagonals: ti(r,s) is the number of incongruent ways to tile an r X s room with 1 X 2 Tatami mats. At most 3 Tatami mats may meet at a point.
 * @author Sean A. Irvine
 */
public class A068926 extends Sequence0 {

  // After Jean-Fran&ccedil;ois Alcover, Dean Hickerson

  private int mN = -1;

  private Z c1s(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return cs(r, s - 2).add(s == 1 ? 1 : 0);
    }
    assert (r & 1) == 0;
    return c2s(r, s - 2).add(s == 1 ? 1 : 0);
  }

  private Z c2s(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return c1s(2, s - 4).add(s == 2 ? 1 : 0);
    }
    assert (r & 1) == 0;
    return c1s(r, s - 2 * r + 4).add(c1s(r, s - 2 * r)).add(s == r - 2 ? 1 : 0).add(s == r ? 1 : 0);
  }

  private Z cs(final int r, final int s) {
    if (s < 0) {
      return Z.ZERO;
    }
    if (r == 1) {
      return A068920.c(r, s);
    }
    if (r == 2) {
      return c1s(r, s).add(c2s(r, s)).add(s == 0 ? 1 : 0);
    }
    if ((r & 1) == 1) {
      return cs(r, s - 2 * r + 2).add(cs(r, s - 2 * r - 2)).add(s == 0 ? 1 : 0).add(s == r - 1 ? 1 : 0).add(s == r + 1 ? 1 : 0);
    } else {
      return c1s(r, s).add(c2s(r, s)).add(s == 0 ? 1 : 0);
    }
  }

  private Z ti(final int r, final int s) {
    if (r > s) {
      return ti(s, r);
    }
    if (r == s) {
      return Z.valueOf(1 - (r & 1));
    }
    return A068920.c(r, s).add(cs(r, s)).divide2();
  }

  @Override
  public Z next() {
    final int m = Functions.TRINV.i(++mN);
    return ti(mN + 1 - m * (m + 1) / 2, (m + 1) * (m + 2) / 2 - mN);
  }
}

