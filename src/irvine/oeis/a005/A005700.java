package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A005700 Number of closed walks of <code>2n</code> unit steps north, east, south, or west starting and ending at the origin and confined to the first octant.
 * @author Sean A. Irvine
 */
public class A005700 extends A000108 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = mA.multiply(t).subtract(mB.square());
    mA = mB;
    mB = t;
    return r;
  }
}
