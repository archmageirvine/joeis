package irvine.math.matrix;

import irvine.math.api.Field;
import irvine.math.api.Matrix;
import irvine.math.api.Sqrt;

/**
 * Cholesky decomposition.
 * @author Sean A. Irvine
 */
final class Cholesky {

  private Cholesky() { }

  // Implementation based on Algorithm 2.7.6 in Henri Cohen,
  // "A Course in Computational Algebraic Number Theory".

  /**
   * Let <code>A</code> be a real symmetric matrix of order <code>n</code>
   * defining a positive definite quadratic form <code>Q</code>.  This
   * method computes constants <code>q_{ij}</code> and a matrix
   * <code>R</code> such that <code>A=R^t R</code>.
   * @param parent field of parent arithmetic supporting square roots
   * @param a the matrix <code>A</code>
   * @param <E> element type
   * @param <P> parent field type
   * @return the matrix <code>R</code>
   */
  static <E, P extends Field<E> & Sqrt<E>> Matrix<E> decomposition(final P parent, final Matrix<E> a) {
    if (!a.isSymmetric()) {
      throw new ArithmeticException("non-symmetric matrix in Cholesky");
    }
    final long n = a.rows();
    final Matrix<E> q = new DefaultMatrix<>(a, parent.zero());
    for (long i = 0; i < n - 1; ++i) {
      for (long j = i + 1; j < n; ++j) {
        q.set(j, i, q.get(i, j));
        q.set(i, j, parent.divide(q.get(i, j), q.get(i, i)));
      }
      for (long k = i + 1; k < n; ++k) {
        for (long l = k; l < n; ++l) {
          q.set(k, l, parent.subtract(q.get(k, l), parent.multiply(q.get(k, i), q.get(i, l))));
        }
      }
    }
    final Matrix<E> r = new DefaultMatrix<>(n, n, parent.zero());
    for (long i = 0; i < n; ++i) {
      r.set(i, i, parent.sqrt(q.get(i, i)));
      for (long j = i + 1; j < n; ++j) {
        r.set(i, j, parent.multiply(r.get(i, i), q.get(i, j)));
      }
    }
    return r;
  }

}
