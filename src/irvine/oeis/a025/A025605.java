package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025605 Number of n-move queen paths on 8x8 board from given corner to opposite corner.
 * @author Sean A. Irvine
 */
public class A025605 extends A025604 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 7, 7);
  }
}
