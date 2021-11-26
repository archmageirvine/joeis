package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a018.A018252;

/**
 * A203415 Vandermonde determinant of the first n nonprimes (A018252).
 * @author Georg Fischer
 */
public class A203415 implements Sequence {

  private int mN = 0;
  private final MemorySequence mA018252 = MemorySequence.cachedSequence(new PrependSequence(new A018252(), 1));

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
