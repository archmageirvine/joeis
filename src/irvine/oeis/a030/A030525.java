package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a039.A039658;
import irvine.oeis.a039.A039660;
import irvine.oeis.a039.A039919;
import irvine.oeis.a055.A055879;
import irvine.oeis.memory.MemorySequence;

/**
 * A030525 Number of polyhexes of class PF2 with a particular symmetry.
 * @author Sean A. Irvine
 */
public class A030525 extends AbstractSequence {

  /** Construct the sequence. */
  public A030525() {
    super(4);
  }

  // Make these sequences start naturally at 0
  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private final MemorySequence mL = MemorySequence.cachedSequence(new PrependSequence(new A039658(), 0));
  private final MemorySequence mMPrime = MemorySequence.cachedSequence(new PrependSequence(new A039919(), 0));
  private final MemorySequence mLPrime = MemorySequence.cachedSequence(new PrependSequence(new A039660(), 0));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z t = mL.a(mN).subtract((mN & 1) == 0 ? mM.a(mN / 2) : Z.ZERO).divide2();
    return mM.a(mN + 1).add(t).add(mMPrime.a((mN + 1) / 2).multiply2()).add(mLPrime.a(mN));
  }
}
