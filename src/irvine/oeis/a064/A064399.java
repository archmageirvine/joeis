package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064399 Numbers k whose sum of digits exceeds the sum of the digits of k^2.
 * @author Sean A. Irvine
 */
public class A064399 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_SUM.l(v) > Functions.DIGIT_SUM.l(mN * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

