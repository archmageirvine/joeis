package irvine.oeis.a203;
// copied from A203991

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a134.A134446;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A203264 Permanent of the n-th principal submatrix of (A134446 in square format).
 * @author Georg Fischer
 */
public class A203264 extends AbstractSequence {

  protected UpperLeftTriangle mULT;
  protected int mN; // current index n
  protected int mOffset; // index of first term
  protected Z mStart; // value of first term

  /** Construct the sequence. */
  public A203264() {
    this(1, new A134446(), 1);
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying sequence.
   * @param offset number of first row: 0 or 1.
   */
  public A203264(final int offset, final Sequence seq) {
    this(offset, seq, 0);
    mStart = null;
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence.
   * @param offset number of first row: 0 or 1.
   * @param start value of first term
   */
  public A203264(final int offset, final Sequence seq, final int start) {
    super(offset);
    if (seq instanceof UpperLeftTriangle) {
      mULT = (UpperLeftTriangle) seq;
    } else {
      final MemorySequence mSeq = MemorySequence.cachedSequence(seq);
      mULT = new UpperLeftTriangle(1, 1, -1) {
        @Override
        public Z matrixElement(final int i, final int j) {
          return mSeq.a((i - mRow0) * (i - mRow0 + 1) / 2 + j - mCol0);
        }
      };
    }
    mN = offset - 1;
    mOffset = offset;
    mStart = Z.valueOf(start);
  }

  @Override
  public Z next() {
    if (++mN == mOffset && mStart != null) {
      return mStart;
    }
    // Construct the n-th principal submatrix
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        mat.set(i, j, mULT.matrixElement(i + 1, j + 1));
      }
    }
    return new MatrixRing<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}
