package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * Convolution of sequences.
 * @author Sean A. Irvine
 */
public class ConvolutionSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private final ArrayList<Z> mTermsA;
  private final ArrayList<Z> mTermsB;

  /**
   * Self-convolution of a sequence.
   * @param seq sequence to convolve
   */
  public ConvolutionSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Convolution of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public ConvolutionSequence(final Sequence a, final Sequence b) {
    this(DEFOFF, a, b);
  }

  /**
   * Self-convolution of a sequence.
   * @param offset first index
   * @param seq sequence to convolve
   */
  public ConvolutionSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeqA = seq;
    mSeqB = null;
    mTermsA = new ArrayList<>();
    mTermsB = mTermsA;
  }

  /**
   * Convolution of a pair of sequences.
   * @param offset first index
   * @param a first sequence
   * @param b second sequence
   */
  public ConvolutionSequence(final int offset, final Sequence a, final Sequence b) {
    super(offset);
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

  /**
   * Apply the self-convolution to the sequence supplied on standard input.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new ConvolutionSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
