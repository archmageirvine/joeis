package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050627 Product of digits of n is a nonzero single-digit square.
 * @author Sean A. Irvine
 */
public class A050627 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long p = Functions.DIGIT_PRODUCT.l(++mN);
      if (p == 1 || p == 4 || p == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
