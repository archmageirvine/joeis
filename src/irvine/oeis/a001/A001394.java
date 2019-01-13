package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a007.A007180;

/**
 * A001394.
 * @author Sean A. Irvine
 */
public class A001394 extends A007180 {

  private boolean mFirst = true;

  @Override
  protected boolean check(final long point, final int n) {
    return !contains(point, n);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    setPathLength(++mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, -1, 1)).shiftLeft(2);
  }
}
