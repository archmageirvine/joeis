package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A203750 Square root of v(2n)/v(2n-1), where v=A203748.
 * @author Georg Fischer
 */
public class A203750 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A203748());

  @Override
  public Z next() {
    ++mN;
    return mSeq.a(2 * mN - 1).divide(mSeq.a(2 * mN - 2)).sqrt();
  }
}
