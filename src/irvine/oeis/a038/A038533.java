package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038533 Denominator of coefficients of both EllipticK/Pi and EllipticE/Pi.
 * @author Sean A. Irvine
 */
public class A038533 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1 + 4 * ++mN - 2 * Integer.bitCount(mN));
  }
}
