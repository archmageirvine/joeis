package irvine.math.matrix;

/**
 * Identity matrix.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class IdentityMatrix<E> extends AbstractMatrix<E> {

  private final long mRows;
  private final E mZero;
  private final E mOne;

  /**
   * Construct square identity matrix of given dimension.
   * @param size number of rows
   * @param zero the zero
   * @param one the one
   */
  public IdentityMatrix(final long size, final E zero, final E one) {
    mRows = size;
    mZero = zero;
    mOne = one;
  }

  @Override
  public E get(final long row, final long col) {
    return row == col ? mOne : mZero;
  }

  @Override
  public void set(final long row, final long col, final E element) {
    // This object is unmodifiable
    throw new UnsupportedOperationException();
  }

  @Override
  public long rows() {
    return mRows;
  }

  @Override
  public long cols() {
    return mRows;
  }

  @Override
  public boolean isDiagonal() {
    return true;
  }

  @Override
  public boolean isUpperTriangular() {
    return true;
  }

  @Override
  public boolean isLowerTriangular() {
    return true;
  }

  @Override
  public boolean isSymmetric() {
    return true;
  }
}
