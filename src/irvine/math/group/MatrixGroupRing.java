package irvine.math.group;

import irvine.math.api.Ring;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.matrix.SmallDenseMatrix;

/**
 * A matrix group where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class MatrixGroupRing<E> extends MatrixGroup<E> {

  protected final Ring<E> mElementRing;
  protected final E mOne;

  /**
   * Construct a new matrix group for matrices of a specified size.
   *
   * @param rows number of rows
   * @param cols number of columns
   * @param elementRing ring of underlying elements
   */
  public MatrixGroupRing(final long rows, final long cols, final Ring<E> elementRing) {
    super(rows, cols, elementRing);
    mElementRing = elementRing;
    mOne = mElementRing.one();
  }

  /**
   * Multiply all elements of the matrix by an element of the coefficient type.
   *
   * @param m matrix
   * @param s element
   * @return matrix multiplied by <code>s</code>
   */
  public Matrix<E> multiply(final Matrix<E> m, final E s) {
    if (s.equals(mOne) || m == zero()) {
      return m;
    }
    final Matrix<E> r = createResultMatrix(m, m);
    if (s.equals(mZero)) {
      return r;
    }
    for (long i = 0; i < rows(); ++i) {
      for (long j = 0; j < cols(); ++j) {
        r.set(i, j, mElementRing.multiply(s, m.get(i, j)));
      }
    }
    return r;
  }

  /**
   * Multiply matrices if they have compatible dimensions. This method does not
   * check for group membership and as such can be used to multiply any two
   * matrices with compatible dimensions.
   *
   * @param a first matrix
   * @param b second matrix
   * @return product of <code>a</code> and <code>b</code>
   */
  public Matrix<E> multiply(final Matrix<E> a, final Matrix<E> b) {
    final long r = a.cols();
    if (r != b.rows()) {
      throw new IllegalArgumentException();
    }
    if (a == zero() || b == zero()) {
      return zero();
    }
    final Matrix<E> product = createResultMatrix(a, b);
    if (a.isDiagonal()) {
      if (b.isDiagonal()) {
        for (long k = 0; k < a.rows(); ++k) {
          product.set(k, k, mElementRing.multiply(a.get(k, k), b.get(k, k)));
        }
      } else {
        for (long i = 0; i < a.rows(); ++i) {
          final E u = a.get(i, i);
          for (long j = 0; j < b.cols(); ++j) {
            product.set(i, j, mElementRing.multiply(u, b.get(i, j)));
          }
        }
      }
    } else if (b.isDiagonal()) {
        for (long i = 0; i < b.rows(); ++i) {
          final E u = b.get(i, i);
          for (long j = 0; j < a.rows(); ++j) {
            product.set(j, i, mElementRing.multiply(a.get(j, i), u));
          }
        }
    } else {
      for (long i = 0; i < a.rows(); ++i) {
        for (long j = 0; j < b.cols(); ++j) {
          E sum = mZero;
          for (long k = 0; k < r; ++k) {
            sum = mElementRing.add(sum, mElementRing.multiply(a.get(i, k), b.get(k, j)));
          }
          product.set(i, j, sum);
        }
      }
    }
    return product;
  }

  private Matrix<E> createResultMatrix(final Matrix<E> a, final Matrix<E> b) {
    return a instanceof SmallDenseMatrix
      ? new SmallDenseMatrix<>(a.rows(), b.cols(), mZero)
      : new DefaultMatrix<>(a.rows(), b.cols(), mZero);
  }

  /**
   * Compute the square of the Frobenius norm of the matrix.  In the case of a
   * vector this is the same as the square of the Euclidean norm.  This method
   * can be useful if the underlying type does not have a defined principle
   * square root.
   * @param m matrix
   * @return squared Frobenius norm
   */
  public E frobeniusSquared(final Matrix<E> m) {
    E norm = mZero;
    for (long row = 0; row < m.rows(); ++row) {
      for (long col = 0; col < m.cols(); ++col) {
        final E e = m.get(row, col);
        norm = mElementRing.add(norm, mElementRing.multiply(e, e));
      }
    }
    return norm;
  }
}
