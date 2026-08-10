package irvine.oeis.a117;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A117329 Determinants of 3 X 3 matrices of discrete blocks of 9 consecutive primes..
 * @author Georg Fischer
 * Copied from A067276.
 */
public class A117329 extends AbstractSequence {

  private final Sequence mSeq;
  private final int mDim;
  private final int mStep;
  private int mLimit; // either 0 or mStep
  private final DefaultMatrix<Q> mMat;

  /** Construct the sequence. */
  public A117329() {
    this(1, new A000040(), 3, 9);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param dim dimension (number of rows = number of columns)
   * @param step how many terms are shifted for the next generation (usually 1 or dim)
   */
  public A117329(final int offset, final Sequence seq, final int dim, final int step) {
    super(offset);
    mSeq = seq;
    mDim = dim;
    mStep = step;
    mLimit = dim * dim; // fill the whole matrix at the beginning
    mMat = new DefaultMatrix<>(mDim, mDim, Q.ZERO);
  }

  @Override
  public Z next() {
    long ro = mLimit / mDim;
    long co = mLimit % mDim; // skip over mLimit elements
    for (long rn = 0; rn < mDim; ++rn) {
      for (long cn = 0; cn < mDim; ++cn) {
        if (co >= mDim) {
          co = 0;
          ++ro;
        }
        if (ro < mDim) {
          mMat.set(rn, cn, mMat.get(ro, co++));
        } else { // get next() elements from mSeq
          mMat.set(rn, cn, new Q(mSeq.next()));
        }
      }
    }
    mLimit = mStep; // next time shift by mStep terms
    return new MatrixField<>(mDim, Rationals.SINGLETON).det(mMat).toZ();
  }
}
