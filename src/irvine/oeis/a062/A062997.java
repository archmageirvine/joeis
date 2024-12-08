package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062997 Numbers whose sum of digits is strictly greater than its product of digits.
 * @author Sean A. Irvine
 */
public class A062997 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) > Functions.DIGIT_PRODUCT.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

