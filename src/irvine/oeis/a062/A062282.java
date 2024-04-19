package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062282 Number of permutations of n elements with an even number of fixed points.
 * @author Sean A. Irvine
 */
public class A062282 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      final Z t = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(2 * k));
      for (int j = 0; j <= mN - 2 * k; ++j) {
        sum = sum.signedAdd((j & 1) == 0, t.divide(Functions.FACTORIAL.z(j)));
      }
    }
    return sum;
  }
}

