package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055471 Numbers that are divisible by the product of their nonzero digits.
 * @author Sean A. Irvine
 */
public class A055471 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.DIGIT_NZ_PRODUCT.l(10, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
