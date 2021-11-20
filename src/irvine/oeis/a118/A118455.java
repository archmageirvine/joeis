package irvine.oeis.a118;
// manually prodsim at 2021-11-19 23:05

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007917;

/**
 * A118455 a(1)=1, a(n) = Product_{k=2..n} P(k), where P(k) is the largest prime &lt;= k.
 * @author Georg Fischer
 */
public class A118455 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A007917());

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
