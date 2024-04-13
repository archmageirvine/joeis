package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062997 Sum of digits is strictly greater than product of digits.
 * @author Sean A. Irvine
 */
public class A062997 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_SUM.l(v) > ZUtils.digitProduct(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

