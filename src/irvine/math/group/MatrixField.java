package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;

/**
 * A matrix where individuals elements are drawn from a field.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class MatrixField<E> extends MatrixRing<E> implements Field<Matrix<E>> {

  private final Field<E> mElementField;

  /**
   * Construct a new matrix ring for matrices of a specified size.
   *
   * @param size number of rows
   * @param elementField field of underlying elements
   */
  public MatrixField(final long size, final Field<E> elementField) {
    super(size, elementField);
    mElementField = elementField;
  }

  @Override
  public Matrix<E> pow(final Matrix<E> a, final long n) {
    return AbstractField.pow(a, n, this);
  }

  @Override
  public Matrix<E> divide(final Matrix<E> n, final Matrix<E> d) {
    return multiply(n, inverse(d));
  }

  /**
   * Apply Gauss-Jordan elimination to matrix <code>a</code> and apply the
   * same row operations to matrix <code>b</code>. The matrix <code>b</code>
   * be null or of different number of columns to <code>a</code>.
   * @param a matrix to reduce (will be modified as a result of the call)
   * @param b companion matrix (may be null)
   * @return true if the reduction was successful (in which case <code>a</code>
   * will be the identity matrix
   */
  public boolean reduce(final Matrix<E> a, final Matrix<E> b) {
    if (b != null && b.rows() != a.rows()) {
      throw new IllegalArgumentException();
    }
    for (long k = 0; k < a.cols(); ++k) {
      // Find first non-zero entry in kth column
      long j;
      for (j = k; j < a.rows(); ++j) {
        if (!mZero.equals(a.get(j, k))) {
          break;
        }
      }
      if (j == rows()) {
        // Entire columns was zero, implies no solution
        return false;
      }
      if (j != k) {
        a.swapRows(j, k);
        if (b != null) {
          b.swapRows(j, k);
        }
      }
      // Scale the kth row, to ensure it has a 1
      final E v = a.get(k, k);
      if (!mOne.equals(v)) {
        final E vi = mElementField.inverse(v);
        // All the entries before k are already 0
        for (long i = k; i < a.cols(); ++i) {
          a.set(k, i, mElementField.multiply(a.get(k, i), vi));
        }
        if (b != null) {
          for (long i = 0; i < b.cols(); ++i) {
            b.set(k, i, mElementField.multiply(b.get(k, i), vi));
          }
        }
      }
      // Add multiples of kth row to lower rows to zero entries
      for (long i = k + 1; i < a.rows(); ++i) {
        final E u = a.get(i, k);
        if (!mZero.equals(u)) {
          final E scale = mElementField.negate(u);
          // First k-1 cols are already zero
          for (long l = k; l < a.cols(); ++l) {
            a.set(i, l, mElementField.add(a.get(i, l), mElementField.multiply(scale, a.get(k, l))));
          }
          if (b != null) {
            for (long l = 0; l < b.cols(); ++l) {
              b.set(i, l, mElementField.add(b.get(i, l), mElementField.multiply(scale, b.get(k, l))));
            }
          }
        }
      }
    }
    // Now do the Jordan step
    for (long k = a.rows() - 1; k > 0; --k) {
      assert mOne.equals(a.get(k, k)); // Note this is not always exactly true in R due to precision problems
      for (long j = k - 1; j >= 0; --j) {
        final E u = a.get(j, k);
        if (!mZero.equals(u)) {
          // Add multiples of the kth row to rows above to introduce zeros
          final E scale = mElementField.negate(u);
          // Only one column of a is affected
          a.set(j, k, mZero);
          if (b != null) {
            for (long l = 0; l < b.cols(); ++l) {
              b.set(j, l, mElementField.add(b.get(j, l), mElementField.multiply(scale, b.get(k, l))));
            }
          }
        }
      }
    }
    return true;
  }

  @Override
  public E det(final Matrix<E> m) {
    // The following implementation requires a proper division operation
    // in the field.  Since we don't have that in the special case of
    // integers, we use a more general implementation to handle that specific
    // case.
    if (mElementField instanceof IntegerField) {
      return super.det(m);
    }
    if (m == zero()) {
      return mZero;
    }
    if (m == one()) {
      return mOne;
    }
    final long size = m.rows();
    if (size <= 3) {
      return super.det(m);
    }
    if (m.isUpperTriangular() || m.isLowerTriangular()) {
      // This also captures the isDiagonal() case
      E det = mOne;
      for (long k = 0; k < size && !mZero.equals(det); ++k) {
        det = mElementRing.multiply(det, m.get(k, k));
      }
      return det;
    }
    // Because we are in a field we can use a Gaussian approach to reduce the
    // matrix to a triangular form and then compute determinant as product of
    // entries on the main diagonal.
    final Matrix<E> w = new DefaultMatrix<>(m, mZero);
    boolean sign = true;
    for (long k = 0; k < cols(); ++k) {
      // Find first non-zero entry in kth column
      long j;
      for (j = k; j < rows(); ++j) {
        if (!mZero.equals(w.get(j, k))) {
          break;
        }
      }
      if (j == rows()) {
        // Entire columns was zero, implies determinant is 0
        return mZero;
      }
      if (j != k) {
        w.swapRows(j, k);
        sign = !sign;
      }
      // Add multiples of kth row to lower rows to zero entries
      final E v = w.get(k, k);
      for (long i = k + 1; i < rows(); ++i) {
        final E u = w.get(i, k);
        if (!mZero.equals(u)) {
          final E scale = mElementField.negate(mElementField.divide(u, v));
          // First k-1 cols are already zero
          for (long l = k; l < cols(); ++l) {
            w.set(i, l, mElementField.add(w.get(i, l), mElementField.multiply(scale, w.get(k, l))));
          }
        }
      }
    }
    E det = mElementField.one();
    for (long k = 0; k < rows(); ++k) {
      det = mElementField.multiply(det, w.get(k, k));
    }
    return sign ? det : mElementField.negate(det);
  }

  @Override
  public Matrix<E> inverse(final Matrix<E> matrix) {
    if (zero().equals(matrix)) {
      throw new IllegalArgumentException();
    }
    if (one().equals(matrix)) {
      return matrix;
    }
    if (matrix.isDiagonal()) {
      // Inverse of diagonal matrix is inverse of elements on main diagonal
      // unless a zero occurs.  Note all matrices of size 0 and 1 are diagonal.
      final Matrix<E> i = new DefaultMatrix<>(rows(), rows(), mZero);
      for (long k = 0; k < rows(); ++k) {
        i.set(k, k, mElementField.inverse(matrix.get(k, k)));
      }
      return i;
    }
    assert rows() >= 2;
    if (rows() == 2) {
      final E det = det(matrix);
      if (det == mZero) {
        throw new IllegalArgumentException();
      }
      final E detInverse = mElementField.inverse(det);
      final Matrix<E> inverse = new DefaultMatrix<>(2, 2, mZero);
      inverse.set(0, 0, mElementField.multiply(matrix.get(1, 1), detInverse));
      inverse.set(0, 1, mElementField.multiply(mElementField.negate(matrix.get(0, 1)), detInverse));
      inverse.set(1, 0, mElementField.multiply(mElementField.negate(matrix.get(1, 0)), detInverse));
      inverse.set(1, 1, mElementField.multiply(matrix.get(0, 0), detInverse));
      return inverse;
    }
    // Need a modifiable identity and do not disturb given matrix
    final Matrix<E> inv = new DefaultMatrix<>(one(), mZero);
    if (!reduce(new DefaultMatrix<>(matrix, mZero), inv)) {
      throw new IllegalArgumentException();
    }
    return inv;
  }

  @Override
  public Group<Matrix<E>> multiplicativeGroup() {
    return new MultiplicativeGroup<>(this);
  }
}
