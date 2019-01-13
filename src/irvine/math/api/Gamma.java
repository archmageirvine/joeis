package irvine.math.api;

/**
 * Definition of the gamma function.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Gamma<E> {

  /**
   * Returns <code>gamma(n)</code>.
   *
   * @param n element to take gamma of
   * @return gamma
   */
  E gamma(final E n);
}
