package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027465 Cube of lower triangular normalized binomial matrix.
 * @author Sean A. Irvine
 */
public class A027465 implements Sequence {

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
      mT = mT.divide(3);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
