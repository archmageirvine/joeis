package irvine.math.api;

/**
 * Definition of the power function.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Pow<E> {

  /**
   * Returns <code>n^e</code>.
   *
   * @param n element to take pow of
   * @param e exponent
   * @return <code>n^e</code>
   */
  E pow(final E n, final E e);
}
