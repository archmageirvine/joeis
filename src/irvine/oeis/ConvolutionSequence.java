package irvine.oeis;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * Convolution of sequences.
 * @author Sean A. Irvine
 */
public class ConvolutionSequence implements Sequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private final ArrayList<Z> mTermsA;
  private final ArrayList<Z> mTermsB;

  /**
   * Self-convolution of a sequence.
   * @param seq sequence to convolve
   */
  public ConvolutionSequence(final Sequence seq) {
    mSeqA = seq;
    mSeqB = null;
    mTermsA = new ArrayList<>();
    mTermsB = mTermsA;
  }

  /**
   * Convolution of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public ConvolutionSequence(final Sequence a, final Sequence b) {
    mSeqA = a;
    mSeqB = b;
    mTermsA = new ArrayList<>();
    mTermsB = new ArrayList<>();
  }

  @Override
  public Z next() {
    mTermsA.add(mSeqA.next());
    if (mSeqB != null) {
      mTermsB.add(mSeqB.next());
    }
    Z s = Z.ZERO;
    final int n = mTermsA.size() - 1;
    for (int k = 0; k <= n; ++k) {
      s = s.add(mTermsA.get(k).multiply(mTermsB.get(n - k)));
    }
    return s;
  }
}
