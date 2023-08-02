package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038533 Denominator of coefficients of both EllipticK/Pi and EllipticE/Pi.
 * @author Sean A. Irvine
 */
public class A038533 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1 + 4L * ++mN - 2 * Integer.bitCount(mN));
  }
}
