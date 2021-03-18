package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045666 Number of 2n-bead balanced binary strings of fundamental period 2n, rotationally inequivalent to reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045666 extends A045684 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply(mN == 0 ? 1 : mN);
  }
}

