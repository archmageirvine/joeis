package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A082939 Numbers such that sum of the digits of the product of the factorial of digits of the number is equal to the sum of the digits of the number.
 * @author Sean A. Irvine
 */
public class A082939 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    Z prod = Z.ONE;
    for (int k = 0; k < cnts.length; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k).pow(cnts[k]));
    }
    return Functions.DIGIT_SUM.l(prod) == Functions.DIGIT_SUM.l(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
