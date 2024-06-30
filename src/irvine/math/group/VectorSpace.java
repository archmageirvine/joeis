package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.api.Ring;
import irvine.math.api.Sqrt;

/**
 * A row vector space where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of vector elements
 */
public class VectorSpace<E> extends MatrixGroupRing<E> {

  /**
   * Construct a new vector space for vectors of a specified length.
   * @param cols number of columns
   * @param elementRing ring of underlying elements
   */
  public VectorSpace(final long cols, final Ring<E> elementRing) {
    super(1, cols, elementRing);
  }

  /**
   * If possible, compute the Euclidean norm of the vector.
   * @param vector vector to compute norm of
   * @return the norm (or approximation in element space thereof)
   * @throws UnsupportedOperationException if the underlying element ring does
   * not support square roots.
   */
  @SuppressWarnings("unchecked")
  public E norm(final Matrix<E> vector) {
    if (mElementRing instanceof Sqrt) {
      return ((Sqrt<E>) mElementRing).sqrt(frobeniusSquared(vector));
    }
    throw new UnsupportedOperationException();
  }

  /**
   * Test for a unit vector. Note this can sometimes be determined even if
   * <code>norm()</code> is not supported in the vector space.
   * @param vector vector to compute norm of
   * @return true if the given vector has norm 1.
   */
  public boolean isUnitVector(final Matrix<E> vector) {
    return mOne.equals(frobeniusSquared(vector));
  }

  /**
   * Compute the dot product of two vectors.
   * @param a first vector
   * @param b second vector
   * @return dot product of <code>a</code> and <code>b</code>
   * @throws IllegalArgumentException if vectors have different lengths
   */
  public E dotProduct(final Matrix<E> a, final Matrix<E> b) {
    if (a.cols() != b.cols() || a.rows() != 1 || b.rows() != 1) {
      throw new IllegalArgumentException();
    }
    E res = mZero;
    for (long k = 0; k < a.cols(); ++k) {
      res = mElementRing.add(res, mElementRing.multiply(a.get(0, k), b.get(0, k)));
    }
    return res;
  }
}
