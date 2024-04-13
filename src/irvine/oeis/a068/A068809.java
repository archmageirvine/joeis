package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068809 Squares with strictly increasing sum of digits.
 * @author Sean A. Irvine
 */
public class A068809 extends Sequence1 {

  private long mSum = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sq = Z.valueOf(++mN).square();
      final long d = Functions.DIGIT_SUM.l(sq);
      if (d > mSum) {
        mSum = d;
        return sq;
      }
    }
  }
}

