package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028889 Numbers whose iterated product of digits is a power of 2.
 * @author Sean A. Irvine
 */
public class A028889 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = Functions.DIGIT_PRODUCT.l(u);
      }
      if (u != 0 && (u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
