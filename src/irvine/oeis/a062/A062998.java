package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062998 Numbers with property that sum of digits is less than or equal to product of digits.
 * @author Sean A. Irvine
 */
public class A062998 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) <= Functions.DIGIT_PRODUCT.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

