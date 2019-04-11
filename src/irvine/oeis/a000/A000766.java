package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001336;

/**
 * A000766 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with <code>x = 1</code>.
 * @author Sean A. Irvine
 */
public class A000766 extends A001336 {

  private boolean mAbs = true;

  @Override
  protected long count(final int point) {
    final int x = x(point) - BIAS;
    return (mAbs ? Math.abs(x) : x) == xPos() ? 4 : 0;
  }

  {
    ++mN;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    mAbs = true;
    final long count = count(ORIGIN + X1 + Y1, 1);
    mAbs = false;
    return Z.valueOf(count + count(ORIGIN + Y1 + 1, 1));
  }

  protected int xPos() {
    return 1;
  }
}
