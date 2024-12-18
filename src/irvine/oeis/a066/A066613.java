package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066613 Numbers k such that the product of the nonzero digits of k equals the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A066613 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_NZ_PRODUCT.l(++mN) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
