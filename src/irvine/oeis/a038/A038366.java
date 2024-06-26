package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038366 n is divisible by (product of digits) + (sum of digits).
 * @author Sean A. Irvine
 */
public class A038366 extends Sequence1 {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Functions.DIGIT_PRODUCT.z(mN).add(Functions.DIGIT_SUM.l(mN))).isZero()) {
        return mN;
      }
    }
  }
}
