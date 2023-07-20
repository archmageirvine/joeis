package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018252;

/**
 * A203418 Vandermonde determinant of the first n composite numbers (A002808).
 * @author Georg Fischer
 */
public class A203418 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mA018252 = MemorySequence.cachedSequence(new A018252());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        final Z diff = mA018252.a(k).subtract(mA018252.a(j));
        if (!diff.isZero()) {
          prod = prod.multiply(diff);
        }
      }
    }
    return prod;
  }
}
