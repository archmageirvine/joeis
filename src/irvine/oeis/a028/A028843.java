package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028843 Numbers whose iterated product of digits is a prime.
 * @author Sean A. Irvine
 */
public class A028843 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = Functions.DIGIT_PRODUCT.l(u);
      }
      if (((0b10101100 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
