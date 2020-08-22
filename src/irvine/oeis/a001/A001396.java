package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a007.A007180;

/**
 * A001396 Number of 2n-step self-avoiding walks on diamond lattice ending at point with x = 0.
 * @author Sean A. Irvine
 */
public class A001396 extends A007180 {
  private boolean mFirst = true;

  @Override
  protected boolean check(final long point, final int n) {
    return !contains(point, n);
  }

  @Override
  protected long count(final long point) {
    final long t = x(point) + y(point) - z(point) - t(point);
    return t == 0 ? 1 : 0;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    mN += 2;
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, -1, 1)).shiftLeft(2);
  }
}
