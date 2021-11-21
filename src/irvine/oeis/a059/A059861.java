package irvine.oeis.a059;
// manually prodsim/prev1m at 2021-11-19 12:41

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A059861 a(n) = Product_{i=2..n} (prime(i) - 2).
 * @author Georg Fischer
 */
public class A059861 implements Sequence {

  private int mN;
  private MemorySequence mSeq;
  private Z mAn1;
  protected long mSub;

  /** Construct the sequence */
  public A059861() {
    this(2);
  }

  /**
   * Generic constructor with parameter.
   * @param sub subtract this value
   */
  protected A059861(final long sub) {
    mN = 0;
    mSub = sub;
    mSeq = MemorySequence.cachedSequence(new A000040());
    mAn1 = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    final Z mR = mSeq.next().subtract(mSub);
    if (mR.compareTo(Z.ZERO) > 0) {
      mAn1 = mAn1.multiply(mR);
    }
    return mAn1;
  }
}
