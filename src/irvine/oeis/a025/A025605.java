package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025605.
 * @author Sean A. Irvine
 */
public class A025605 extends A025604 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 7, 7);
  }
}
