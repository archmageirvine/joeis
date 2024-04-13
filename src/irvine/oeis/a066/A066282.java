package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066282 Numbers k such that k = (product of nonzero digits of k) * (sum of digits of k).
 * @author Sean A. Irvine
 */
public class A066282 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_NZ_PRODUCT.l(10, v) * Functions.DIGIT_SUM.l(mN) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
