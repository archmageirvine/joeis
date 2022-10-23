package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A203306 Vandermonde determinant of (1!, 2!, 3!, ..., n!).
 * @author Georg Fischer
 */
public class A203306 extends Sequence0 {

  private int mN = -1;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        final Z diff = FACTORIAL.factorial(k).subtract(FACTORIAL.factorial(j));
        if (!diff.isZero()) {
          prod = prod.multiply(diff);
        }
      }
    }
    return prod;
  }
}
