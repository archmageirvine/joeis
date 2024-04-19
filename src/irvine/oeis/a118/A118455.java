package irvine.oeis.a118;
// manually prodsim at 2021-11-19 23:05

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007917;
import irvine.oeis.memory.MemorySequence;

/**
 * A118455 a(1)=1, a(n) = Product_{k=2..n} P(k), where P(k) is the largest prime &lt;= k.
 * @author Georg Fischer
 */
public class A118455 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A007917());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    if (mN >= 2) {
      for (int k = 2; k <= mN; ++k) {
        prod = prod.multiply(mSeq.a(k - 2));
      }
    }
    return prod;
  }
}
