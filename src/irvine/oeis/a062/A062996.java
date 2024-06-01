package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062996 Sum of digits is greater than or equal to product of digits.
 * @author Sean A. Irvine
 */
public class A062996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) >= Functions.DIGIT_PRODUCT.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

