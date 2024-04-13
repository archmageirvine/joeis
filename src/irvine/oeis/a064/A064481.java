package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064481 Divisible by the sum of the digits of its base-5 representation.
 * @author Sean A. Irvine
 */
public class A064481 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.DIGIT_SUM.l(5, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
