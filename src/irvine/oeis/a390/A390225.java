package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390225 Positive numbers whose base-3, base-5, and base-7 expansions have the same digit sum.
 * @author Sean A. Irvine
 */
public class A390225 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = Functions.DIGIT_SUM.l(3, ++mN);
      if (Functions.DIGIT_SUM.l(5, mN) == s && Functions.DIGIT_SUM.l(7, mN) == s) {
        return Z.valueOf(mN);
      }
    }
  }
}
