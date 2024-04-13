package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028841 Iterated sum of digits of n is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A028841 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = Functions.DIGIT_SUM.l(u);
      }
      if (((0b100101110 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
