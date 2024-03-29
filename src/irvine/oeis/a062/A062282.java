package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062282 Number of permutations of n elements with an even number of fixed points.
 * @author Sean A. Irvine
 */
public class A062282 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      final Z t = F.factorial(mN).divide(F.factorial(2 * k));
      for (int j = 0; j <= mN - 2 * k; ++j) {
        sum = sum.signedAdd((j & 1) == 0, t.divide(F.factorial(j)));
      }
    }
    return sum;
  }
}

