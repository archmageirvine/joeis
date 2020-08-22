package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013626 Triangle of coefficients in expansion of (5+7x)^n.
 * @author Sean A. Irvine
 */
public class A013626 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.FIVE.pow(mN);
    } else {
      mT = mT.divide(5).multiply(7);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
