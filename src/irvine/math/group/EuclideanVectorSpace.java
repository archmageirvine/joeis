package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.z.Z;

/**
 * An Euclidean row vector space.
 * @author Sean A. Irvine
 * @param <E> underlying type of vector elements
 */
public class EuclideanVectorSpace<E> extends VectorSpace<E> {

  private final AbstractOrderedField<E> mElementRing;

  /**
   * Construct a new vector space for vectors of a specified length.
   * @param cols number of columns
   * @param elementRing ring of underlying elements
   */
  public EuclideanVectorSpace(final long cols, final AbstractOrderedField<E> elementRing) {
    super(cols, elementRing);
    mElementRing = elementRing;
  }

  // Algorithm 1.3.14 in Cohen
  private Matrix<E> getShortestLinearCombination(Matrix<E> b, Matrix<E> a, E normB, E normA) {
    assert !mElementRing.gt(normB, normA);
    while (true) {
      final E n = dotProduct(a, b);
      final Z r = mElementRing.round(mElementRing.divide(n, normB));
      final E q = mElementRing.coerce(r);
      final E v = mElementRing.multiply(q, n);
      final E s = mElementRing.add(mElementRing.subtract(normA, mElementRing.add(v, v)), mElementRing.multiply(mElementRing.coerce(r.square()), normB));
      if (!mElementRing.gt(normB, s)) {
        return b;
      }
      final Matrix<E> t = subtract(a, multiply(b, q));
      a = b;
      b = t;
      normA = normB;
      normB = s;
    }
  }

  /**
   * Given two linearly independent vectors find a non-zero shortest vector
   * which is a linear combination of the two vectors.
   * @param a first vector
   * @param b second vector
   * @return short vector
   */
  public Matrix<E> shortestLinearCombination(final Matrix<E> a, final Matrix<E> b) {
    final E normA = norm(a);
    final E normB = norm(b);
    if (mElementRing.lt(normA, normB)) {
      return getShortestLinearCombination(b, a, normB, normA);
    } else {
      return getShortestLinearCombination(a, b, normA, normB);
    }
  }
}
