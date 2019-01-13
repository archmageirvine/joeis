package irvine.math.api;

/**
 * Definition of the exponential function.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Exp<E> {

  /**
   * Returns <code>exp(n)</code>.
   *
   * @param n element to take exponential of
   * @return exponential
   */
  E exp(final E n);
}
