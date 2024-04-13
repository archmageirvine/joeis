package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054684 Numbers whose sum of digits is odd.
 * @author Sean A. Irvine
 */
public class A054684 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    final long v = ++mN;
    while ((Functions.DIGIT_SUM.l(v) & 1) == 0) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
