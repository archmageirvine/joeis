package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068920 Table of t(r,s) read by antidiagonals: t(r,s) is the number of ways to tile an r X s room with 1 X 2 Tatami mats. At most 3 Tatami mats may meet at a point.
 * @author Sean A. Irvine
 */
public class A068920 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover, Dean Hickerson

  private int mN = -1;

  private static Z c1(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return c(2, s - 1);
    }
    assert (r & 1) == 0;
    return c2(r, s - 1).add(s == 1 ? 1 : 0);
  }

  private static Z c2(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return c1(2, s - 2).add(s == 2 ? 1 : 0);
    }
    assert (r & 1) == 0;
    return c1(r, s - r + 2).add(c1(r, s - r)).add(s == r - 2 ? 1 : 0).add(s == r ? 1 : 0);
  }

  static Z c(final int r, final int s) {
    if (s < 0) {
      return Z.ZERO;
    }
    if (r == 1) {
      return Z.valueOf(1 - (s & 1));
    }
    if (r == 2) {
      return c1(2, s).add(c2(2, s)).add(s == 0 ? 1 : 0);
    }
    if ((r & 1) == 1) {
      return c(r, s - r + 1).add(c(r, s - r - 1)).add(s == 0 ? 1 : 0);
    } else {
      return c1(r, s).add(c2(r, s)).add(s == 0 ? 1 : 0);
    }
  }

  private Z t(final int r, final int s) {
    if (r > s) {
      return t(s, r);
    }
    final Z c = c(r, s);
    return r > 1 && (r & 1) == 1 ? c.multiply2() : c;
  }

  @Override
  public Z next() {
    final int m = (int) Functions.TRINV.l(++mN);
    return t(mN + 1 - m * (m + 1) / 2, (m + 1) * (m + 2) / 2 - mN);
  }
}

