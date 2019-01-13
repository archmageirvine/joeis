package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;

/**
 * A row vector space where individuals elements are drawn from a field.
 * @author Sean A. Irvine
 * @param <E> underlying type of vector elements
 */
public class VectorSpaceOverField<E> extends VectorSpace<E> {

  private final Field<E> mElementField;

  /**
   * Construct a new vector space for vectors of a specified length.
   *
   * @param cols number of columns
   * @param elementField field of underlying elements
   */
  public VectorSpaceOverField(final long cols, final Field<E> elementField) {
    super(cols, elementField);
    mElementField = elementField;
  }

  /**
   * Compute the projection of <code>a</code> onto <code>b</code>.
   * @param a first vector
   * @param b second vector
   * @return projection of <code>a</code> onto <code>b</code>.
   * @throws IllegalArgumentException if vectors have different lengths
   */
  public Matrix<E> projection(final Matrix<E> a, final Matrix<E> b) {
    if (a.cols() != b.cols() || a.rows() != 1 || b.rows() != 1) {
      throw new IllegalArgumentException();
    }
    final Matrix<E> res = new DefaultMatrix<>(1, a.cols(), mZero);
    final E d = dotProduct(a, b);
    final E squaredNorm = frobeniusSquared(b);
    final E scale = mElementField.divide(d, squaredNorm);
    for (long k = 0; k < a.cols(); ++k) {
      res.set(0, k, mElementField.multiply(b.get(0, k), scale));
    }
    return res;
  }
}
