package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383328 Numbers that have the same set of digits as the sum of the squares of their digits.
 * @author Sean A. Irvine
 */
public class A383328 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(++mN) == Functions.SYNDROME.i(Functions.DIGIT_SUM_SQUARES.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
