package irvine.oeis.a203;
// manually 2021-10-24

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A203991 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of {(i+j)*min(i,j)} (A203990).
 * @author Georg Fischer
 */
public class A203991 extends AbstractSequence {

  protected UpperLeftTriangle mULT;
  protected int mRow; // current row index n
  protected int mCol; // current column index k
  protected Z[] mLastRow; // = get(mRow)

  /** Construct the sequence. */
  public A203991() {
    this(1, new A203990());
  }

  /** 
   * Generic constructor with parameter
   * @param seq underlying sequence.
   * @param offset number of first row: 0 or 1.
   */
  public A203991(final int offset, final Sequence seq) {
    super(1);
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
    mRow = offset - 1;
    mCol = mRow;
  }

  protected void addRow() {
    ++mRow;
    mLastRow = new Z[mRow + 1];
    mCol = 0;
    final int n = mRow;
    // Construct a symmetric n-diagonal matrix
    final Matrix<Z> mat = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        mat.set(i, j, mULT.matrixElement(i + 1, j + 1));
      }
    }
    // Compute the characteristic polynomial of the matrix
    final Polynomial<Z> charPoly = new MatrixRing<>(n, IntegerField.SINGLETON).characteristicPolynomial(mat);
    // System.out.println("n=" + n + ", charPoly=" + charPoly);
    final int deg = charPoly.degree();
    for (int k = 0; k <= deg; ++k) {
      mLastRow[k] = (mRow & 1) == 0 ? charPoly.coeff(k) : charPoly.coeff(k).negate();
    }
  }
  
  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0, 0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mCol > mRow) {
      addRow();
    }
    return mLastRow[mCol];
  }
}
