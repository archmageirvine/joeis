package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013620 Triangle of coefficients in expansion of (2+3x)^n.
 * @author Sean A. Irvine
 */
public class A013620 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.ONE;
    } else {
      mT = mT.multiply(3);
    }
    return Binomial.binomial(mN, mM).multiply(mT).shiftLeft(mN - mM);
  }
}
