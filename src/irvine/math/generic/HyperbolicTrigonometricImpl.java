package irvine.math.generic;

import irvine.math.api.Exp;
import irvine.math.api.Field;
import irvine.math.api.Ring;

/**
 * Generic implementation of hyperbolic trigonometric functions.
 *
 * @author Sean A. Irvine
 */
public final class HyperbolicTrigonometricImpl {
  
  private HyperbolicTrigonometricImpl() { }

  /**
   * Returns the hyperbolic sine of a number.
   * @param ring ring in which to compute hyperbolic sine
   * @param half a value representing one half in the field
   * @param n number to compute hyperbolic sine of
   * @param <E> number type
   * @param <R> ring type
   * @return hyperbolic sine
   */
  public static <R extends Ring<E> & Exp<E>, E> E sinh(final R ring, final E half, final E n) {
    return ring.multiply(ring.subtract(ring.exp(n), ring.exp(ring.negate(n))), half);
  }

  /**
   * Returns the hyperbolic cosine of a number.
   * @param ring ring in which to compute hyperbolic cosine
   * @param half a value representing one half in the field
   * @param n number to compute hyperbolic cosine of
   * @param <E> number type
   * @param <R> ring type
   * @return hyperbolic cosine
   */
  public static <R extends Ring<E> & Exp<E>, E> E cosh(final R ring, final E half, final E n) {
    return ring.multiply(ring.add(ring.exp(n), ring.exp(ring.negate(n))), half);
  }

  /**
   * Returns the hyperbolic tangent of a number.
   * @param field field in which to compute hyperbolic tangent
   * @param n number to compute hyperbolic tangent of
   * @param <E> number type
   * @param <F> field type
   * @return hyperbolic tangent
   */
  public static <F extends Field<E> & Exp<E>, E> E tanh(final F field, final E n) {
    final E plus = field.exp(n);
    final E minus = field.exp(field.negate(n));
    return field.divide(field.subtract(plus, minus), field.add(plus, minus));
  }

  /**
   * Returns the hyperbolic cotangent of a number.
   * @param field field in which to compute hyperbolic cotangent
   * @param n number to compute hyperbolic cotangent of
   * @param <E> number type
   * @param <F> field type
   * @return hyperbolic tangent
   */
  public static <F extends Field<E> & Exp<E>, E> E coth(final F field, final E n) {
    final E plus = field.exp(n);
    final E minus = field.exp(field.negate(n));
    return field.divide(field.add(plus, minus), field.subtract(plus, minus));
  }

  /**
   * Returns the hyperbolic secant of a number.
   * @param field field in which to compute hyperbolic secant
   * @param two a value representing one two in the field
   * @param n number to compute hyperbolic secant of
   * @param <E> number type
   * @param <F> field type
   * @return hyperbolic secant
   */
  public static <F extends Field<E> & Exp<E>, E> E sech(final F field, final E two, final E n) {
    return field.divide(two, field.add(field.exp(n), field.exp(field.negate(n))));
  }

  /**
   * Returns the hyperbolic cosecant of a number.
   * @param field field in which to compute hyperbolic cosecant
   * @param two a value representing one two in the field
   * @param n number to compute hyperbolic cosecant of
   * @param <E> number type
   * @param <F> field type
   * @return hyperbolic cosecant
   */
  public static <F extends Field<E> & Exp<E>, E> E csch(final F field, final E two, final E n) {
    return field.divide(two, field.subtract(field.exp(n), field.exp(field.negate(n))));
  }

}
