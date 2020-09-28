package irvine.oeis.a035;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035119 Related to A045720 and A035101.
 * @author Sean A. Irvine
 */
public class A035119 implements Sequence {

  private int mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return mN == 3 ? Z.ONE : Z.ZERO;
    }
    mF = mF.multiply(mN);
    Z b = Binomial.binomial(2L * mN, mN);
    return b.multiply(mN + 2).subtract(Z.THREE.shiftLeft(2 * mN - 1)).multiply(mF).shiftRight(mN);
  }
}
