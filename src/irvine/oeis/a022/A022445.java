package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a007.A007825;

/**
 * A022445 Number of self-avoiding closed walks (from 0 to <code>0)</code> of length <code>2n</code> in the strip <code>{0, 1, 2}</code> X Z of the square lattice Z X Z.
 * @author Sean A. Irvine
 */
public class A022445 extends A007825 {

  private static final int ORIGIN = c(0, 0);

  @Override
  protected int step() {
    return 2;
  }

  @Override
  protected long count(final int point) {
    return point == ORIGIN ? 1 : 0;
  }

  @Override
  protected boolean check(final int point, final int n) {
    final int y = y(point) - BIAS;
    if (y < 0 || y >= 3) {
      return false;
    }
    final int x = x(point) - BIAS;
    if (Math.abs(x) + y + n >= mN) {
      return false; // can never make it back in time
    }
    return !contains(point, n);
  }

  @Override
  protected boolean contains(final int point, final int n) {
    return (n <= 2 || n != mN - 1 || point != ORIGIN) && super.contains(point, n);
  }

  @Override
  public Z next() {
    mN += step();
    if (mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    final long leftRight = count(c(1, 0), 1);
    final long up = count(c(0, 1), 1);
    return Z.valueOf(leftRight).multiply2().add(up);
  }
}
