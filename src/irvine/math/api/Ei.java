package irvine.math.api;

/**
 * Definition of the exponential integral.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Ei<E> {

  /**
   * Returns the exponential integral of a number.  Defined by
   * <code>Ei(z)=-\int_{-z}^\infty\frac{e^{-t}}{t}\,dt</code>.
   * Implementations may vary over the domain supported.
   * @param n element
   * @return sine
   */
  E ei(final E n);

}
