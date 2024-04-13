package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A049102 Positive numbers n such that n is a multiple of (product of digits of n) * (sum of digits of n).
 * @author Sean A. Irvine
 */
public class A049102 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN);
      if (prod != 0 && mN % (prod * Functions.DIGIT_SUM.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

