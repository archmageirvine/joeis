package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066613 Product of the nonzero digits = number of divisors.
 * @author Sean A. Irvine
 */
public class A066613 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_NZ_PRODUCT.l(10, v) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
