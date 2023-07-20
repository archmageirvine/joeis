package irvine.oeis.a080;
// manually prodsi2 at 2021-11-25

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A080358 Value of Vandermonde determinant for the first n prime numbers: V[prime(1), ..., prime(n)].
 * @author Georg Fischer
 */
public class A080358 extends Sequence1 {

  protected int mN = 0;
  private final MemorySequence mA000040 = MemorySequence.cachedSequence(new PrependSequence(new A000040(), 1));

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(mA000040.a(k).subtract(mA000040.a(j)));
      }
    }
    return prod;
  }
}
