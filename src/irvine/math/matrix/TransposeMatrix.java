package irvine.math.matrix;

import irvine.math.api.Matrix;

/**
 * Proxy for transpose.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class TransposeMatrix<E> extends AbstractMatrix<E> {

  private final Matrix<E> mMatrix;

  /**
   * Construct transpose backed by the given matrix.
   * @param matrix underlying matrix
   */
  public TransposeMatrix(final Matrix<E> matrix) {
    mMatrix = matrix;
  }

  @Override
  public E get(final long row, final long col) {
    return mMatrix.get(col, row);
  }

  @Override
  public void set(final long row, final long col, final E element) {
    mMatrix.set(col, row, element);
  }

  @Override
  public long rows() {
    return mMatrix.cols();
  }

  @Override
  public long cols() {
    return mMatrix.rows();
  }

  @Override
  public Matrix<E> transpose() {
    return mMatrix;
  }

  @Override
  public boolean isDiagonal() {
    return mMatrix.isDiagonal();
  }

  @Override
  public boolean isUpperTriangular() {
    return mMatrix.isLowerTriangular();
  }

  @Override
  public boolean isLowerTriangular() {
    return mMatrix.isUpperTriangular();
  }

  @Override
  public boolean isSymmetric() {
    return mMatrix.isSymmetric();
  }
}
