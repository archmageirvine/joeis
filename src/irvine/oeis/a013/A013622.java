package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013622 Triangle of coefficients in expansion of (3+5x)^n.
 * @author Sean A. Irvine
 */
public class A013622 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.THREE.pow(mN);
    } else {
      mT = mT.divide(3).multiply(5);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
