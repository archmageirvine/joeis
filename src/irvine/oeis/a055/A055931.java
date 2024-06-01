package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055931 Product of the digits of n divides the sum of the digits of n.
 * @author Sean A. Irvine
 */
public class A055931 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long dp = Functions.DIGIT_PRODUCT.l(++mN);
      if (dp != 0 && Functions.DIGIT_SUM.l(mN) % dp == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
