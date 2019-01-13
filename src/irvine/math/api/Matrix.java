package irvine.math.api;

import java.io.Serializable;

/**
 * Definition for a matrix. The methods provided here are fairly minimal, with
 * richer functionality supplied by <code>MatrixGroup</code>,
 * <code>MatrixField</code>, etc.  Operations provided here are limited to
 * those not requiring typing of the actual elements.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Matrix<E> extends Serializable {

  /**
   * Retrieve element at specified position.
   * @param row row position
   * @param col column position
   * @return element
   */
  E get(final long row, final long col);

  /**
   * Set element at specified position.
   * @param row row position
   * @param col column position
   * @param element element to set
   */
  void set(final long row, final long col, final E element);

  /**
   * Number of rows in the matrix.
   * @return number of rows
   */
  long rows();

  /**
   * Number of columns in the matrix.
   * @return number of columns
   */
  long cols();

  /**
   * The transpose of this matrix; that is, the matrix formed by
   * interchanging the rows and columns.
   * @return transpose of this matrix
   */
  Matrix<E> transpose();

  /**
   * Return the submatrix formed by deleting the specified row and column,
   * adjusting the index of all the other rows and columns accordingly.
   *
   * @param row row to delete
   * @param col column to delete
   * @return submatrix
   */
  Matrix<E> delete(final long row, final long col);

  /**
   * Swap rows.
   *
   * @param a first row
   * @param b second row
   */
  void swapRows(final long a, final long b);

  /**
   * Test if this matrix has the same number of rows as columns.
   * @return true iff matrix is square
   */
  boolean isSquare();

  /**
   * Test if this matrix has all zeros off the main diagonal.
   * @return true iff matrix is diagonal
   */
  boolean isDiagonal();

  /**
   * Test if the matrix is upper triangular.  That is, all entries
   * below the main diagonal are zero.
   * @return true iff matrix is upper triangular.
   */
  boolean isUpperTriangular();

  /**
   * Test if the matrix is lower triangular.  That is, all entries
   * above the main diagonal are zero.
   * @return true iff matrix is lower triangular.
   */
  boolean isLowerTriangular();

  /**
   * Test if the matrix is symmetric. That is, <code>a_{ij}=a_{ji}</code>,
   * for all <code>i</code> and <code>j</code>.
   * @return true iff matrix is symmetric
   */
  boolean isSymmetric();
}
