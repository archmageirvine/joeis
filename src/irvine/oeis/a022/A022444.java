package irvine.oeis.a022;

import irvine.oeis.a007.A007825;

/**
 * A022444 Number of self-avoiding closed walks (from (0,0) to (0,0)) of length 2n in strip {-1, 0, 1} X Z.
 * @author Sean A. Irvine
 */
public class A022444 extends A007825 {

  private static final int ORIGIN = c(0, 1);

  @Override
  protected int step() {
    return 2;
  }

  @Override
  protected long count(final int point) {
    return point == ORIGIN ? 2 : 0;
  }

  @Override
  protected boolean check(final int point, final int n) {
    final int y = y(point) - BIAS;
    if (y < 0 || y >= 3) {
      return false;
    }
    final int x = x(point) - BIAS;
    if (Math.abs(x) + Math.abs(y - 1) + n >= mN) {
      return false; // can never make it back in time
    }
    return !contains(point, n);
  }

  @Override
  protected boolean contains(final int point, final int n) {
    return (n <= 2 || n != mN - 1 || point != ORIGIN) && super.contains(point, n);
  }
}
