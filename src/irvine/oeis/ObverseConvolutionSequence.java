package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.z.Z;

/**
 * Obverse convolution of sequences.
 * In contrast to the normal convolution, the operators "+" and "*" are swapped.
 * @author Georg Fischer
 */
public class ObverseConvolutionSequence extends ConvolutionSequence {

  /**
   * Self-convolution of a sequence.
   * @param seq sequence to convolve
   */
  public ObverseConvolutionSequence(final Sequence seq) {
    super(seq);
  }

  /**
   * Convolution of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public ObverseConvolutionSequence(final Sequence a, final Sequence b) {
    super(a, b);
  }

  /**
   * Self-convolution of a sequence.
   * @param offset first index
   * @param seq sequence to convolve
   */
  public ObverseConvolutionSequence(final int offset, final Sequence seq) {
    super(offset, seq);
  }

  /**
   * Convolution of a pair of sequences.
   * @param offset first index
   * @param a first sequence
   * @param b second sequence
   */
  public ObverseConvolutionSequence(final int offset, final Sequence a, final Sequence b) {
    super(offset, a, b);
  }

  @Override
  public Z next() {
    mTermsA.add(mSeqA.next());
    if (mSeqB != null) {
      mTermsB.add(mSeqB.next());
    }
    Z s = Z.ONE;
    final int n = mTermsA.size() - 1;
    for (int k = 0; k <= n; ++k) {
      s = s.multiply(mTermsA.get(k).add(mTermsB.get(n - k)));
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
      final Sequence seq = new ObverseConvolutionSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
