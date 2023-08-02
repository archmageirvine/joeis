package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000048;

/**
 * A045663 Number of 2n-bead balanced binary strings of fundamental period 2n, rotationally equivalent to complement.
 * @author Sean A. Irvine
 */
public class A045663 extends A000048 {

  @Override
  public Z next() {
    return super.next().multiply(mN == 0 ? 1 : 2L * mN);
  }
}

