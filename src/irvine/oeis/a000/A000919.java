package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000919.
 * @author Sean A. Irvine
 */
public class A000919 extends A000453 {

  private int mN = 3;

  @Override
  public Z next() {
    if (mN > 0) {
      --mN;
      return Z.ZERO;
    }
    return super.next().multiply(24);
  }
}
