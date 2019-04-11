package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013627 Triangle of coefficients in expansion of <code>(6+7x)^n</code>.
 * @author Sean A. Irvine
 */
public class A013627 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.SIX.pow(mN);
    } else {
      mT = mT.divide(6).multiply(7);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
