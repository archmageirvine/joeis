package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001412;

/**
 * A000760.
 * @author Sean A. Irvine
 */
public class A000760 extends A001412 {

  // See A000759.  There is an additional asymmetry here for +1/-1 in X
  // direction for first step.

  private boolean mAbs = true;

  @Override
  protected long count(final int point) {
    final int x = x(point) - BIAS;
    return (mAbs ? Math.abs(x) : x) == xPos() ? 1 : 0;
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
    final long count = count(ORIGIN + X1, 1);
    mAbs = false;
    return Z.valueOf(count + 4 * count(ORIGIN + Y1, 1));
  }

  protected int xPos() {
    return 1;
  }
}
