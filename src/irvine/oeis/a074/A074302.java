package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074302 Sum of squares of digits of n is equal to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074302 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.l(++mN) == Functions.DIGIT_SUM_SQUARES.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
