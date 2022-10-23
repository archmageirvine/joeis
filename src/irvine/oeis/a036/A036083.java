package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036083 Expansion of (-1+1/(1-5*x)^5)/(25*x); related to A036071.
 * @author Sean A. Irvine
 */
public class A036083 extends Sequence0 {

  private int mN = -1;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT == null ? Z.ONE : mT.multiply(5);
    return Binomial.binomial(mN + 5, 4).multiply(mT);
  }
}
