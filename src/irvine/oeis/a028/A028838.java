package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028838 Numbers whose sum of digits is a power of 2.
 * @author Sean A. Irvine
 */
public class A028838 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long u = Functions.DIGIT_SUM.l(v);
      if ((u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
