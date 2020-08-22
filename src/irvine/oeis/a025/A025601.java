package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025601 Number of n-move knight paths on 8 X 8 board from given corner to opposite corner.
 * @author Sean A. Irvine
 */
public class A025601 extends A025600 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 7, 7);
  }
}
