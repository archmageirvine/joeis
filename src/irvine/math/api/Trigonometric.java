package irvine.math.api;

/**
 * Definition of trigonometric functions.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Trigonometric<E> {

  /**
   * Returns the sine of a number.
   * @param n element
   * @return sine
   */
  E sin(final E n);

  /**
   * Returns the cosine of a number.
   * @param n element
   * @return cosine
   */
  E cos(final E n);

  /**
   * Returns the tangent of a number.
   * @param n element
   * @return tangent
   */
  E tan(final E n);

  /**
   * Returns the cotangent of a number.
   * @param n element
   * @return tangent
   */
  E cot(final E n);

  /**
   * Returns the arcsine of a number.
   * @param n element
   * @return arcsine
   */
  E asin(final E n);

  /**
   * Returns the arccosine of a number.
   * @param n element
   * @return cosine
   */
  E acos(final E n);

  /**
   * Returns the arctangent of a number.
   * @param n element
   * @return tangent
   */
  E atan(final E n);
}
