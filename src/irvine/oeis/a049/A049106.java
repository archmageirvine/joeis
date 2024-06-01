package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049106 Ratio from A049102.
 * @author Sean A. Irvine
 */
public class A049106 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long prod = Functions.DIGIT_PRODUCT.l(++mN);
      if (prod != 0) {
        final long t = prod * Functions.DIGIT_SUM.l(mN);
        if (mN % t == 0) {
          return Z.valueOf(mN / t);
        }
      }
    }
  }
}

