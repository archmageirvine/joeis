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

  /**
   * Returns the hyperbolic arcsine of a number.
   * @param n element
   * @return hyperbolic arcsine
   */
  E asinh(final E n);

  /**
   * Returns the hyperbolic arccosine of a number.
   * @param n element
   * @return hyperbolic arccosine
   */
  E acosh(final E n);

  /**
   * Returns the hyperbolic arctangent of a number.
   * @param n element
   * @return hyperbolic arctangent
   */
  E atanh(final E n);

  /**
   * Returns the hyperbolic arccotangent of a number.
   * @param n element
   * @return hyperbolic arccotangent
   */
  E acoth(final E n);

  /**
   * Returns the hyperbolic arcsecant of a number.
   * @param n element
   * @return hyperbolic arcsecant
   */
  E asech(final E n);

  /**
   * Returns the hyperbolic arccosecant of a number.
   * @param n element
   * @return hyperbolic arccosecant
   */
  E acsch(final E n);

}
