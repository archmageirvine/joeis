package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000681;

/**
 * A005650 Number of "magic squares" of order n (see comment line for exact definition).
 * @author Sean A. Irvine
 */
public class A005650 extends A000681 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().shiftLeft(mN / 2).divide(mF);
  }
}

