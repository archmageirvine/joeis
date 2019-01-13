package irvine.math.api;

/**
 * Definition of hyperbolic trigonometric functions.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface HyperbolicTrigonometric<E> {

  /**
   * Returns the hyperbolic sine of a number.
   * @param n element
   * @return hyperbolic sine
   */
  E sinh(final E n);

  /**
   * Returns the hyperbolic cosine of a number.
   * @param n element
   * @return hyperbolic cosine
   */
  E cosh(final E n);

  /**
   * Returns the hyperbolic tangent of a number.
   * @param n element
   * @return hyperbolic tangent
   */
  E tanh(final E n);

  /**
   * Returns the hyperbolic cotangent of a number.
   * @param n element
   * @return hyperbolic cotangent
   */
  E coth(final E n);

  /**
   * Returns the hyperbolic secant of a number.
   * @param n element
   * @return hyperbolic secant
   */
  E sech(final E n);

  /**
   * Returns the hyperbolic cosecant of a number.
   * @param n element
   * @return hyperbolic cosecant
   */
  E csch(final E n);

}
