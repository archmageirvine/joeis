package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A203751 Square root of v(2n+1)/(3v(2n), where v=A203748.
 * @author Georg Fischer
 */
public class A203751 extends A203748 {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A203748());

  @Override
  public Z next() {
    ++mN;
    return mSeq.a(2 * mN).divide(mSeq.a(2 * mN - 1).multiply(3)).sqrt();
  }
}
