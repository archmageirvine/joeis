package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028839 Sum of digits of n is a square.
 * @author Sean A. Irvine
 */
public class A028839 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long u = Functions.DIGIT_SUM.l(v);
      final long s = Functions.SQRT.l(u);
      if (s * s == u) {
        return Z.valueOf(mN);
      }
    }
  }
}
