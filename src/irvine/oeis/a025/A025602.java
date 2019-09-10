package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025602 Number of n-move knight paths on <code>8x8</code> board from given corner to adjacent corner.
 * @author Sean A. Irvine
 */
public class A025602 extends A025600 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0, 7);
  }
}
