package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060068.
 * @author Sean A. Irvine
 */
public class A060076 extends A060058 {

  private int mN = -1;

  @Override
  public Z next() {
    return mA.get(++mN + 3, mN);
  }
}
