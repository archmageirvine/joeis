package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002705 Sets with a congruence property.
 * @author Sean A. Irvine
 */
public class A002705 extends A002704 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 4;
    return q(mN, 2);
  }
}
