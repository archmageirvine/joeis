package irvine.math.polynomial;

import irvine.math.api.Field;
import irvine.math.group.MatrixField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;

/**
 * Compute polynomial discriminants.
 *
 * @author Sean A. Irvine
 */
public final class Discriminant {

  private Discriminant() { }

  /**
   * Compute discriminant of polynomial in a ring.  In general this should not be
   * called directly, but via the discriminant method on the ring itself.
   * @param ring ring of polynomial
   * @param p the polynomial
   * @param <E> coefficient field
   * @return discriminant of polynomial in coefficient ring
   */
  public static <E> E discriminant(final PolynomialRingField<E> ring, final Polynomial<E> p) {
    final Field<E> coefficientField = ring.coefficientField();
    final int n = p.degree();
    if (n <= 1) {
      if (n == 1) {
        return coefficientField.one();
      }
      return coefficientField.zero();
    }
    final long size = 2L * n - 1;
    // Build Sylvester matrix
    final Polynomial<E> dp = ring.diff(p);
    final MatrixField<E> field = new MatrixField<>(size, coefficientField);
    final Matrix<E> m = new DefaultMatrix<>(size, size, coefficientField.zero());
    for (int k = 0; k < dp.degree(); ++k) {
      for (int j = 0; j <= n; ++j) {
        m.set(k, j + k, p.coeff(n - j));
      }
    }
    for (int k = 0; k < n; ++k) {
      for (int j = 0; j < n; ++j) {
        m.set(k + dp.degree(), j + k, dp.coeff(dp.degree() - j));
      }
    }
    final E det = field.det(m);
    final long sign = (long) n * (n - 1) / 2;
    final E disc = coefficientField.divide(det, p.coeff(n));
    return (sign & 1) == 0 ? disc : coefficientField.negate(disc);
  }
}
