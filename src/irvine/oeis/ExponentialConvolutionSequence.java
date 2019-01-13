package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Convolution of sequences.
 * @author Sean A. Irvine
 */
public class ExponentialConvolutionSequence implements Sequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private final ArrayList<Z> mTermsA;
  private final ArrayList<Z> mTermsB;

  /**
   * Self-convolution of a sequence.
   * @param seq sequence to convolve
   */
  public ExponentialConvolutionSequence(final Sequence seq) {
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
  public ExponentialConvolutionSequence(final Sequence a, final Sequence b) {
    mSeqA = a;
    mSeqB = b;
    mTermsA = new ArrayList<>();
    mTermsB = new ArrayList<>();
  }

  /**
   * Get the next term in an exponential transform
   * @param a first sequence
   * @param b second sequence
   * @param n size
   * @return next term
   */
  public static Z exponentialTransform(final List<Z> a, final List<Z> b, final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k).multiply(a.get(k)).multiply(b.get(n - 1 - k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    mTermsA.add(mSeqA.next());
    if (mSeqB != null) {
      mTermsB.add(mSeqB.next());
    }
    return exponentialTransform(mTermsA, mTermsB, mTermsB.size());
  }

  /**
   * Apply the exponential transform to the sequence supplied on standard input.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final ExponentialConvolutionSequence seq = new ExponentialConvolutionSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
