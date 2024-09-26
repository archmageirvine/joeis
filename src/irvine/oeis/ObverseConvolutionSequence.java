package irvine.oeis;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Obverse convolution of sequences.
 * In contrast to the normal convolution, the operators "+" and "*" are swapped.
 * @author Georg Fischer
 */
public class ObverseConvolutionSequence extends ConvolutionSequence {

  private final Q mFactor; // factor for the resulting product

  /**
   * Obverse convolution of a pair of sequences with no factor.
   * @param offset first index
   * @param a first sequence
   * @param b second sequence; maybe the same as <code>a</code>
   */
  public ObverseConvolutionSequence(final int offset, final Sequence a, final Sequence b) {
    this(offset, a, b, null);
  }

  /**
   * Obverse convolution of a pair of sequences with a specific factor.
   * @param offset first index
   * @param a first sequence
   * @param b second sequence; maybe the same as <code>a</code>
   * @param factor rational factor to multiply the resulting product with
   */
  public ObverseConvolutionSequence(final int offset, final Sequence a, final Sequence b, final Q factor) {
    super(offset, a, b);
    mFactor = factor;
  }

  @Override
  public Z next() {
    final Z ta = mSeqA.next();
    mTermsA.add(ta);
    mTermsB.add(mSeqB != null ? mSeqB.next() : ta);
    Z s = Z.ONE;
    final int n = mTermsA.size() - 1;
    for (int k = 0; k <= n; ++k) {
      s = s.multiply(mTermsA.get(k).add(mTermsB.get(n - k)));
    }
    return mFactor == null ? s : mFactor.multiply(s).num();
  }
}
