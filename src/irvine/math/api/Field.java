package irvine.math.api;

/**
 * Definition of a field and associated operations.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Field<E> extends Ring<E> {

  /**
   * Return the multiplicative inverse of an element.
   * @param element element to get inverse of
   * @return the inverse
   */
  E inverse(final E element);

  /**
   * Convenience method for multiplication by an inverse.
   * @param n dividend
   * @param d divisor
   * @return result of division
   */
  E divide(final E n, final E d);

  /**
   * Return the multiplicative group corresponding to the nonzero elements of
   * the field.
   * @return multiplicative group
   */
  Group<E> multiplicativeGroup();
}
