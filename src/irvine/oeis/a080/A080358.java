package irvine.oeis.a080;
// manually prodsi2 at 2021-11-25

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A080358 Value of Vandermonde determinant for the first n prime numbers: V[p(1),...,p(n)].
 * @author Georg Fischer
 */
public class A080358 implements Sequence {

  protected int mN = 0;
  protected final MemorySequence mA000040 = MemorySequence.cachedSequence(new PrependSequence(new A000040(), 1));

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
