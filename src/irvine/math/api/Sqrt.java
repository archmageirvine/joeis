package irvine.math.api;

/**
 * Definition of square root function.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Sqrt<E> {

  /**
   * Returns <code>sqrt(n)</code> or in some cases <code>floor(sqrt(n))</code>.
   *
   * @param n element to take square root of
   * @return square root
   * @throws IllegalArgumentException if the square root is not possible
   */
  E sqrt(final E n);
}
