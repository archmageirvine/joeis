package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066565 Numbers that when multiplied by the product of their nonzero digits produce a square.
 * @author Sean A. Irvine
 */
public class A066565 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(Functions.DIGIT_NZ_PRODUCT.z(10, mN)).isSquare()) {
        return mN;
      }
    }
  }
}
