package irvine.oeis.a182;
// manually prodsim at 2021-11-19 23:05

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A182484 a(n) = Product_{k=1..p-1} k^(2k-p-1), where p = prime(n).
 * @author Georg Fischer
 */
public class A182484 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A000040());

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    final int p = mSeq.a(mN - 1).intValue();
    for (int k = 1; k <= p - 1; ++k) {
      prod = prod.multiply(new Q(k).pow(2 * k - p - 1));
    }
    return prod.toZ();
  }
}
