package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038368 n is divisible by |(product of digits) - (sum of digits)|.
 * @author Sean A. Irvine
 */
public class A038368 extends Sequence1 {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = Functions.DIGIT_PRODUCT.z(mN).subtract(Functions.DIGIT_SUM.l(mN)).abs();
      if (!t.isZero() && mN.mod(t).isZero()) {
        return mN;
      }
    }
  }
}
