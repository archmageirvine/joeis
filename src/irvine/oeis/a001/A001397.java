package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a007.A007180;

/**
 * A001397.
 * @author Sean A. Irvine
 */
public class A001397 extends A007180 {

  @Override
  protected boolean check(final long point, final int n) {
    return !contains(point, n);
  }

  @Override
  protected long count(final long point) {
    final long t = x(point) + y(point) - z(point) - t(point);
    return Math.abs(t) == 2 ? 1 : 0;
  }

  @Override
  public Z next() {
    mN += 2;
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, -1, 1)).multiply2();
  }
}
