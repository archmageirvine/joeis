package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034087 Numbers divisible by the sum of the squares of their digits.
 * @author Sean A. Irvine
 */
public class A034087 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.DIGIT_SUM_SQUARES.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

