package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007602 Numbers that are divisible by the product of their digits.
 * @author Sean A. Irvine
 */
public class A007602 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final long prod = Functions.DIGIT_PRODUCT.l(n);
      if (prod != 0 && mN % prod == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
