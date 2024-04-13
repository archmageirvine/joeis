package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037301 Numbers whose base-2 and base-3 expansions have the same digit sum.
 * @author Sean A. Irvine
 */
public class A037301 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long v = ++mN;
      if (Functions.DIGIT_SUM.l(2, v) == Functions.DIGIT_SUM.l(3, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

