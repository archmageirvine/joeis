package irvine.oeis;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * Compute the Dirichlet convolution of two sequences.
 * @author Georg Fischer
 */
public class DirichletConvolutionSequence implements Sequence {

  protected final MemorySequence mSeq1;
  protected final MemorySequence mSeq2;
  protected final int mOffset1; // offset of mSeq1
  protected final int mOffset2; // offset of mSeq2
  protected int mN; // current index >= 1

  /**
   * Create a Dirichlet convolution of a sequence with itself.
   * @param seq1 first sequence
   * @param offset1 offset of <code>seq1</code>
   */
  public DirichletConvolutionSequence(final Sequence seq1, final int offset1) {
    mN = 0;
    mOffset1 = offset1;
    mOffset2 = mOffset1;
    mSeq1 = MemorySequence.cachedSequence(seq1);
    mSeq2 = mSeq1;
  }

  /**
   * Create a Dirichlet convolution of two (different) sequences.
   * @param seq1 first sequence
   * @param offset1 offset of <code>seq1</code>
   * @param seq2 second sequence
   * @param offset2 offset of <code>seq2</code>
   */
  public DirichletConvolutionSequence(final Sequence seq1, final int offset1, final Sequence seq2, final int offset2) {
    mN = 0;
    mOffset1 = offset1;
    mOffset2 = offset2;
    mSeq1 = MemorySequence.cachedSequence(seq1);
    mSeq2 = MemorySequence.cachedSequence(seq2);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mSeq1.a(mN / d - mOffset1).multiply(mSeq2.a(d - mOffset2)));
    }
    return sum;
  } 

}
