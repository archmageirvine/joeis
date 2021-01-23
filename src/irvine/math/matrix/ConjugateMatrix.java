package irvine.math.matrix;

import irvine.math.api.Matrix;
import irvine.math.api.Ring;

/**
 * Proxy for conjugate.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class ConjugateMatrix<E> extends AbstractMatrix<E> {

  private final Ring<E> mElementRing;
  private final Matrix<E> mMatrix;

  /**
   * Construct the conjugate backed by the given matrix.
   * @param matrix underlying matrix
   */
  public ConjugateMatrix(final Ring<E> elementRing, final Matrix<E> matrix) {
    mElementRing = elementRing;
    mMatrix = matrix;
  }

  @Override
  public E get(final long row, final long col) {
    return mElementRing.conjugate(mMatrix.get(row, col));
  }

  @Override
  public void set(final long row, final long col, final E element) {
    mMatrix.set(row, col, mElementRing.conjugate(element));
  }

  @Override
  public long rows() {
    return mMatrix.rows();
  }

  @Override
  public long cols() {
    return mMatrix.cols();
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
