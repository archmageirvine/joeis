package irvine.oeis.a118;
// manually prodsim at 2021-11-19 23:05

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007918;
import irvine.oeis.memory.MemorySequence;

/**
 * A118456 a(n) = Product_{k=1..n} P(k), where P(k) is the smallest prime &gt;= k.
 * @author Georg Fischer
 */
public class A118456 extends Sequence1 {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A007918());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(mSeq.a(k));
    }
    return prod;
  }
}
