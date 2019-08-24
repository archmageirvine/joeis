package irvine.math.matrix;

import irvine.math.api.Matrix;
import irvine.math.api.Ring;

/**
 * Test if a matrix is singular.  Should not normally be called directly.
 * @author Sean A. Irvine
 */
public final class Singular {

  private Singular() { }

  public static <E> boolean isSingular(final Matrix<E> matrix, final Ring<E> elementRing) {
    // We need to decide if the determinant is 0, but we can do slightly better
    // than explicitly computing the entire determinant.  We use row reduction,
    // but if we get a zero on the diagonal we can immediately conclude that the
    // matrix is singular
    final E zero = elementRing.zero();
    final Matrix<E> m = new DefaultMatrix<>(matrix, zero);
    for (long k = m.rows() - 1; k >= 0; --k) {
      // If possible, find a row <= k with a leading one in column k
      for (long j = k; j >= 0; --j) {
        if (!zero.equals(m.get(j, k))) {
          m.swapRows(j, k);
        }
      }
      if (zero.equals(m.get(k, k))) {
        // There is no row with a 1 in column k -> det = 0 -> singular
        return true;
      }
      // Now eliminate leading 1 from all other earlier rows
      for (long j = k - 1; j >= 0; --j) {
        final E a = m.get(j, k);
        if (!zero.equals(m.get(j, k))) {
          // We can't do division so ...
          final E b = m.get(k, k);
          for (long i = 0; i < m.cols(); ++i) {
            final E bi = elementRing.multiply(m.get(j, i), b);
            final E ai = elementRing.multiply(m.get(k, i), a);
            m.set(j, i, elementRing.subtract(bi, ai));
          }
          assert zero.equals(m.get(j, k));
        }
      }
    }
    return false; //rows[0] == 0;
  }
}
