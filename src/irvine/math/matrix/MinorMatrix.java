package irvine.math.matrix;

import irvine.math.api.Matrix;

/**
 * Proxy for matrix with a deleted row and column.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class MinorMatrix<E> extends AbstractMatrix<E> {

  private final Matrix<E> mMatrix;
  private final long mDeletedRow;
  private final long mDeletedCol;

  /**
   * Construct transpose backed by the given matrix.
   * @param matrix underlying matrix
   * @param row deleted row
   * @param col deleted column
   */
  public MinorMatrix(final Matrix<E> matrix, final long row, final long col) {
    mMatrix = matrix;
    mDeletedRow = row;
    mDeletedCol = col;
  }

  @Override
  public E get(final long row, final long col) {
    return mMatrix.get(row < mDeletedRow ? row : row + 1, col < mDeletedCol ? col : col + 1);
  }

  @Override
  public void set(final long row, final long col, final E element) {
    mMatrix.set(row < mDeletedRow ? row : row + 1, col < mDeletedCol ? col : col + 1, element);
  }

  @Override
  public long rows() {
    return mMatrix.cols() - 1;
  }

  @Override
  public long cols() {
    return mMatrix.rows() - 1;
  }

  @Override
  public boolean isDiagonal() {
    if (mDeletedRow == mDeletedCol) {
      return mMatrix.isDiagonal();
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUpperTriangular() {
    if (mDeletedRow == mDeletedCol) {
      return mMatrix.isUpperTriangular();
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isLowerTriangular() {
    if (mDeletedRow == mDeletedCol) {
      return mMatrix.isLowerTriangular();
    }
    throw new UnsupportedOperationException();
  }
}
