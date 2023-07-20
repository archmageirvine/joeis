package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A203315 Vandermonde determinant of the first n odd primes.
 * @author Georg Fischer
 */
public class A203315 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mA000040 = MemorySequence.cachedSequence(new A000040());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        final Z diff = mA000040.a(k).subtract(mA000040.a(j));
        if (!diff.isZero()) {
          prod = prod.multiply(diff);
        }
      }
    }
    return prod;
  }
}
