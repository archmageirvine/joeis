package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065448 Numbers k such that k is congruent to the product of its digits modulo the sum of its digits.
 * @author Sean A. Irvine
 */
public class A065448 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = Functions.DIGIT_SUM.l(++mN);
      if (mN % s == Functions.DIGIT_PRODUCT.l(mN) % s) {
        return Z.valueOf(mN);
      }
    }
  }
}
