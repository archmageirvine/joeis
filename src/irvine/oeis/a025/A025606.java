package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025606 Number of n-move queen paths on 8x8 board from given corner to adjacent corner.
 * @author Sean A. Irvine
 */
public class A025606 extends A025604 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0, 7);
  }
}
