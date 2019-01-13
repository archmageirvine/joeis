package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a007.A007180;

/**
 * A001398.
 * @author Sean A. Irvine
 */
public class A001398 extends A007180 {

  {
    ++mN;
  }

  @Override
  protected boolean check(final long point, final int n) {
    return !contains(point, n);
  }

  @Override
  protected long count(final long point) {
    final long t = x(point) + y(point) - z(point) - t(point);
    return Math.abs(t) == 3 ? 1 : 0;
  }

  @Override
  public Z next() {
    mN += 2;
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, -1, 1)).multiply2();
  }
}
