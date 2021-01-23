package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038535 Numerators of coefficients of EllipticE/Pi.
 * @author Sean A. Irvine
 */
public class A038535 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).square().shiftRight(2 * Integer.bitCount(mN)).divide(1 - 2 * mN);
  }
}

