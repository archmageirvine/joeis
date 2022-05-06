package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A203758 Square root of v(2n+1)/[2v(2n-1)], where v=A203755.
 * @author Georg Fischer
 */
public class A203758 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A203755());

  @Override
  public Z next() {
    ++mN;
    return mSeq.a(2 * mN).divide(mSeq.a(2 * mN - 1).multiply2()).sqrt();
  }
}
