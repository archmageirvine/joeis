package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013628 Triangle of coefficients in expansion of (4 + 5*x)^n.
 * @author Sean A. Irvine
 */
public class A013628 extends Sequence0 {

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
      mT = mT.multiply(5);
    }
    return Binomial.binomial(mN, mM).multiply(mT).shiftLeft(2L * (mN - mM));
  }
}
