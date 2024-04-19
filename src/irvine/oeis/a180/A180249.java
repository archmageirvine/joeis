package irvine.oeis.a180;
// manually 2023-07-10

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056493;
import irvine.oeis.memory.MemorySequence;

/**
 * A180249 a(n) is the total number of k-reverses of n.
 * @author Georg Fischer
 */
public class A180249 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mSeq = MemorySequence.cache(1, new A056493());

  @Override
  public Z next() {
    // a(n) = Sum_{d|n} d*A056493(d)/2
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(d).multiply(d).divide2());
  }
}
