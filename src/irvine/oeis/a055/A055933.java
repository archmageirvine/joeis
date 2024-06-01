package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055933 Product of digits (not counting zeros) of n divides sum of digits of n.
 * @author Sean A. Irvine
 */
public class A055933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) % Functions.DIGIT_NZ_PRODUCT.l(10, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
