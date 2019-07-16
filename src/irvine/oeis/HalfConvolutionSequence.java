package irvine.oeis;

import irvine.math.z.Z;

/**
 * Construct a sequence corresponding to the half convolution of two other sequence.
 * <code>a(n) = sum_{k=1..floor((n+1)/2)} s(k)*t(n+1-k)</code>.  Assumes sequence
 * is indexed from 0, even though term 0 is not used.
 * @author Sean A. Irvine
 */
public class HalfConvolutionSequence implements Sequence {

  private final MemorySequence mA;
  private final MemorySequence mB;
  private int mN = 0;

  /**
   * Construct a half-convolution sequence
   * @param a first sequence
   * @param b second sequence
   */
  public HalfConvolutionSequence(final Sequence a, final Sequence b) {
    mA = MemorySequence.cachedSequence(a);
    mB = MemorySequence.cachedSequence(b);
  }

  /**
   * Construct a half-convolution sequence
   * @param seq sequence
   */
  public HalfConvolutionSequence(final Sequence seq) {
    mA = MemorySequence.cachedSequence(seq);
    mB = mA;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(mA.a(k).multiply(mB.a(mN + 1 - k)));
    }
    return sum;
  }
}
