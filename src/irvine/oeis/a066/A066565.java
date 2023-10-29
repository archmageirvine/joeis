package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066565 Numbers that when successively multiplied by their nonzero digits produce a square.
 * @author Sean A. Irvine
 */
public class A066565 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(ZUtils.digitNZProduct(mN, 10)).isSquare()) {
        return mN;
      }
    }
  }
}
