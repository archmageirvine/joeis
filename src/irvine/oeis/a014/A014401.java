package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014401 Denominators of coefficients of expansion of Bessel function <code>J_3(x)</code>.
 * @author Sean A. Irvine
 */
public class A014401 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.square().multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).shiftLeft(2 * mN + 3);
  }
}

