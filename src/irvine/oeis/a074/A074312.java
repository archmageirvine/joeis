package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074312 Numbers k such that the product of the digits of k equals the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A074312 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_PRODUCT.z(++mN).equals(Functions.SIGMA0.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
