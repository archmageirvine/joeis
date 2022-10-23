package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045654 Number of 2n-bead balanced binary strings, rotationally equivalent to complement.
 * @author Sean A. Irvine
 */
public class A045654 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    int m = mN;
    while ((m & 1) == 0) {
      sum = sum.add(Z.ONE.shiftLeft(m));
      m >>>= 1;
    }
    return sum.add(Z.ONE.shiftLeft(m));
  }
}
