package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028891 Iterated product of digits of n is a positive Fibonacci number.
 * @author Sean A. Irvine
 */
public class A028891 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = Functions.DIGIT_PRODUCT.l(u);
      }
      if (((0b100101110 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
