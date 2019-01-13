package irvine.math.matrix;

/**
 * Zero matrix.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class ZeroMatrix<E> extends AbstractMatrix<E> {

  private final long mRows;
  private final long mCols;
  private final E mZero;

  /**
   * Construct zero matrix of given dimensions.
   * @param rows number of rows
   * @param cols number of cols
   * @param zero the zero
   */
  public ZeroMatrix(final long rows, final long cols, final E zero) {
    mRows = rows;
    mCols = cols;
    mZero = zero;
  }

  @Override
  public E get(final long row, final long col) {
    return mZero;
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
    return mCols;
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
    return isSquare();
  }
}
