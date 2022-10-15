package irvine.math.matrix;

import java.util.HashMap;

import irvine.math.api.Matrix;
import irvine.util.Pair;

/**
 * A simple implementation back by a <code>HashMap</code>. Suitable for small
 * matrices and sparse matrices.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class DefaultMatrix<E> extends AbstractMatrix<E> {

  protected long mRows;
  protected long mCols;
  private final E mZero;
  private final HashMap<Pair<Long, Long>, E> mMatrix = new HashMap<>();

  /*
   * Keep track of whether this matrix is diagonal.  If the status is
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
  public DefaultMatrix(final long rows, final long cols, final E zero) {
    if (rows < 0 || cols < 0) {
      throw new IllegalArgumentException();
    }
    mRows = rows;
    mCols = cols;
    mZero = zero;
  }

  /**
   * Construct matrix directly from array of values
   * @param elements the matrix
   * @param zero zero element
   * @exception IllegalArgumentException if rows or columns is non-positive.
   */
  public DefaultMatrix(final E[][] elements, final E zero) {
    this(elements.length, elements[0].length, zero);
    for (int r = 0; r < elements.length; ++r) {
      for (int c = 0; c < elements[r].length; ++c) {
        set(r, c, elements[r][c]);
      }
    }
  }

  /**
   * Construct matrix from a matrix (effectively a copy).  This is sometimes
   * necessary if the original matrix is unmodifiable.
   * @param matrix the matrix
   * @param zero the zero
   */
  public DefaultMatrix(final Matrix<E> matrix, final E zero) {
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
    final E e = mMatrix.get(new Pair<>(row, col));
    return e == null ? mZero : e;
  }

  @Override
  public final void set(final long row, final long col, final E element) {
    if (row < 0 || col < 0 || row >= mRows || col >= mCols) {
      throw new IllegalArgumentException();
    }
    mHashCode = null; // Any previous hash is now invalid
    final Pair<Long, Long> key = new Pair<>(row, col);
    if (element.equals(mZero)) {
      if (mMatrix.remove(key) != null && row != col) {
        mDiagonalStatusKnown = false;
        if (row > col) {
          mUpperTriangularStatusKnown = false;
        } else {
          assert row < col;
          mLowerTriangularStatusKnown = false;
        }
      }
    } else {
      if (row != col) {
        mDiagonalStatusKnown = true;
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
      mMatrix.put(key, element);
    }
  }

  @Override
  public long rows() {
    return mRows;
  }

  @Override
  public long cols() {
    return mCols;
  }

  /**
   * Set the number of rows.  This should be used with care and probably
   * only works for increasing the number of rows.
   * @param rows new number of rows.
   */
  public void setRows(final long rows) {
    mRows = rows;
  }

  /**
   * Set the number of columns.  This should be used with care and probably
   * only works for increasing the number of columns.
   * @param cols new number of columns.
   */
  public void setCols(final long cols) {
    mCols = cols;
  }

  private void checkDiagonal() {
    if (!mDiagonalStatusKnown) {
      mDiagonalStatusKnown = true;
      for (final Pair<Long, Long> key : mMatrix.keySet()) {
        if (!key.left().equals(key.right())) {
          mIsDiagonal = false;
          return;
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
      for (final Pair<Long, Long> key : mMatrix.keySet()) {
        if (key.left() > key.right()) {
          mIsUpperTriangular = false;
          return;
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
      for (final Pair<Long, Long> key : mMatrix.keySet()) {
        if (key.left() < key.right()) {
          mIsLowerTriangular = false;
          return;
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
      mHashCode = mMatrix.hashCode();
    }
    return mHashCode;
  }

  @Override
  public boolean equals(final Object o) {
    return super.equals(o);
  }
}
