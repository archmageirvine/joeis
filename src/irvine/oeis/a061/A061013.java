package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061013 Numbers k such that (product of digits of k) is divisible by (sum of digits of k), where 0's are not permitted.
 * @author Sean A. Irvine
 */
public class A061013 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long p = Functions.DIGIT_PRODUCT.l(v);
      if (p != 0 && p % Functions.DIGIT_SUM.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

