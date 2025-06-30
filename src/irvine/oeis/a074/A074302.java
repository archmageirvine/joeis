package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074302 Sum of squares of digits of n is equal to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074302 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.l(++mN) == Functions.DIGIT_SUM_SQUARES.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
