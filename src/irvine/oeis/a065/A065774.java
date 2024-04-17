package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065774 Numbers k such that the product of the digits of k is equal to the sum of the prime factors of k, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A065774 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long prod = Functions.DIGIT_PRODUCT.l(v);
      if (prod > 1 && Functions.SOPFR.z(mN).equals(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
