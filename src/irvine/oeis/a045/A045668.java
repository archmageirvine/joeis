package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045668 Number of 2n-bead balanced binary strings of fundamental period 2n, rotationally equivalent to complement, inequivalent to reverse and reversed complement.
 * @author Sean A. Irvine
 */
public class A045668 extends A045686 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply(mN == 0 ? 1 : mN);
  }
}

