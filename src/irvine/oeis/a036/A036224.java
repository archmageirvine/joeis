package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036224 Expansion of (-1+1/(1-6*x)^6)/(36*x); related to A036084.
 * @author Sean A. Irvine
 */
public class A036224 extends Sequence0 {

  private int mN = -1;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT == null ? Z.ONE : mT.multiply(6);
    return Binomial.binomial(mN + 6, 5).multiply(mT);
  }
}
