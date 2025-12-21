package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391471 Integers n such that floor((11/10)*n + 1/2) is a digit permutation of n.
 * @author Sean A. Irvine
 */
public class A391471 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SORT_DESCENDING.l(++mN) == Functions.DIGIT_SORT_DESCENDING.l((11 * mN + 5) / 10)) {
        return Z.valueOf(mN);
      }
    }
  }
}
