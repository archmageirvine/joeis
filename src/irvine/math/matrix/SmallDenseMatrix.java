package irvine.math.matrix;

import java.util.Arrays;

import irvine.math.api.Matrix;

/**
 * A direct array implementation suitable for small matrices.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public final class SmallDenseMatrix<E> extends AbstractMatrix<E> {

  private final int mRows;
  private final int mCols;
  private final E mZero;
  private final E[][] mMatrix;

  /*
   * Keep track of whether or not this matrix is diagonal.  If the status is
   * known then the second variable is a true representation of the state.
   * A call to <code>isDiagonal</code> will either return the known value or
   * trigger a computation to get the answer. Knowing a matrix is diagonal
   * can speed up various computations.  Similar pairs keep track of upper
   * and lower triangular matrices.
   */
  private boolean mDiagonalStatusKnown = true;
  private boolean mIsDiagonal = true;
  private boolean mUpperTriangularStatusKnown = true;
  private boolean mIsUpperTriangular = true;
  private boolean mLowerTriangularStatusKnown = true;
  private boolean mIsLowerTriangular = true;
  private Integer mHashCode = null;

  /**
   * Construct zero matrix of specified size.
   * @param rows number of rows
   * @param cols number of columns
   * @param zero zero element
   * @exception IllegalArgumentException if rows or columns is negative.
   */
  @SuppressWarnings("unchecked")
  public SmallDenseMatrix(final long rows, final long cols, final E zero) {
    if (rows < 0 || cols < 0 || rows > Integer.MAX_VALUE || cols > Integer.MAX_VALUE) {
      throw new IllegalArgumentException();
    }
    mRows = (int) rows;
    mCols = (int) cols;
    mZero = zero;
    mMatrix = (E[][]) new Object[mRows][mCols];
  }

  /**
   * Construct matrix directly from array of values
   * @param elements the matrix
   * @param zero zero element
   * @exception IllegalArgumentException if rows or columns is non-positive.
   */
  public SmallDenseMatrix(final E[][] elements, final E zero) {
    mMatrix = elements;
    mRows = elements.length;
    mCols = elements[0].length;
    mZero = zero;
    mDiagonalStatusKnown = false;
    mLowerTriangularStatusKnown = false;
    mUpperTriangularStatusKnown = false;
  }

  /**
   * Construct matrix from a matrix (effectively a copy).  This is sometimes
   * necessary if the original matrix is unmodifiable or a different type.
   * @param matrix the matrix
   * @param zero the zero
   */
  public SmallDenseMatrix(final Matrix<E> matrix, final E zero) {
    this(matrix.rows(), matrix.cols(), zero);
    for (long r = 0; r < rows(); ++r) {
      for (long c = 0; c < cols(); ++c) {
        set(r, c, matrix.get(r, c));
      }
    }
  }

  @Override
  public E get(final long row, final long col) {
    if (row < 0 || col < 0 || row >= mRows || col >= mCols) {
      throw new IllegalArgumentException();
    }
    final E e = mMatrix[(int) row][(int) col];
    return e == null ? mZero : e;
  }

  @Override
  public void set(final long row, final long col, final E element) {
    if (row < 0 || col < 0 || row >= mRows || col >= mCols) {
      throw new IllegalArgumentException();
    }
    mHashCode = null; // Any previous hash is now invalid
    if (row != col) {
      if (mZero.equals(element)) {
        mDiagonalStatusKnown = false;
        if (row > col) {
          mUpperTriangularStatusKnown = false;
        } else {
          assert row < col;
          mLowerTriangularStatusKnown = false;
        }
      } else {
        mIsDiagonal = false;
        if (row > col) {
          mUpperTriangularStatusKnown = true;
          mIsUpperTriangular = false;
        } else {
          assert row < col;
          mLowerTriangularStatusKnown = true;
          mIsLowerTriangular = false;
        }
      }
    }
    mMatrix[(int) row][(int) col] = element;
  }

  @Override
  public long rows() {
    return mRows;
  }

  @Override
  public long cols() {
    return mCols;
  }

  private void checkDiagonal() {
    if (!mDiagonalStatusKnown) {
      mDiagonalStatusKnown = true;
      for (int k = 0; k < mRows; ++k) {
        for (int j = 0; j < mCols; ++j) {
          if (k != j && !mMatrix[k][j].equals(mZero)) {
            mIsDiagonal = false;
            return;
          }
        }
      }
      mIsDiagonal = true;
    }
  }

  @Override
  public boolean isDiagonal() {
    if (!isSquare()) {
      return false;
    }
    checkDiagonal();
    return mIsDiagonal;
  }

  private void checkUpperTriangular() {
    if (!mUpperTriangularStatusKnown) {
      mUpperTriangularStatusKnown = true;
      for (int k = 0; k < mRows; ++k) {
        for (int j = 0; j < k; ++j) {
          if (!mMatrix[k][j].equals(mZero)) {
            mIsUpperTriangular = false;
            return;
          }
        }
      }
      mIsUpperTriangular = true;
    }
  }

  @Override
  public boolean isUpperTriangular() {
    if (!isSquare()) {
      return false;
    }
    checkUpperTriangular();
    return mIsUpperTriangular;
  }

  private void checkLowerTriangular() {
    if (!mLowerTriangularStatusKnown) {
      mLowerTriangularStatusKnown = true;
      for (int k = 0; k < mRows; ++k) {
        for (int j = k + 1; j < mCols; ++j) {
          if (!mMatrix[k][j].equals(mZero)) {
            mIsLowerTriangular = false;
            return;
          }
        }
      }
      mIsLowerTriangular = true;
    }
  }

  @Override
  public boolean isLowerTriangular() {
    if (!isSquare()) {
      return false;
    }
    checkLowerTriangular();
    return mIsLowerTriangular;
  }

  @Override
  public int hashCode() {
    // Avoid recomputing hashcode if it has not changed
    if (mHashCode == null) {
      mHashCode = Arrays.deepHashCode(mMatrix); // Requires all matrices be this type
      //mHashCode = super.hashCode();
    }
    return mHashCode;
  }

  @Override
  public boolean equals(final Object o) {
    return super.equals(o);
  }
}

