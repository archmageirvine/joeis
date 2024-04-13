package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054683 Numbers whose sum of digits is even.
 * @author Sean A. Irvine
 */
public class A054683 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    final long v = ++mN;
    while ((Functions.DIGIT_SUM.l(v) & 1) == 1) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
