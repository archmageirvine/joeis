package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062999 Numbers k with property that the sum of the digits of k is strictly less than the product of the digits of k.
 * @author Sean A. Irvine
 */
public class A062999 extends Sequence1 {

  private long mN = 22;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_SUM.l(v) < Functions.DIGIT_PRODUCT.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

