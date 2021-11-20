package irvine.oeis.a181;
// manually prodsim at 2021-11-19 23:05

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A181574 a(n) = Product_{i=2..n} (tau(i)+1)/(tau(i)-1), where tau(.)=A000005(.).
 * @author Georg Fischer
 */
public class A181574 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A000005());

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    if (mN >= 2) {
      for (int i = 2; i <= mN; ++i) {
        prod = prod.multiply(new Q(mSeq.a(i - 1).add(1), mSeq.a(i - 1).subtract(1)));
      }
    }
    return prod.toZ();
  }
}
