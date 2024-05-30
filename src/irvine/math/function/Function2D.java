package irvine.math.function;

import irvine.math.z.Z;

/**
 * A two argument integer function with a default for the first parameter.
 * Several methods are defined but all should return the exact same function
 * (apart with differences in supported range of inputs and output).
 * The return type can be <code>Z</code>, <code>long</code>, or <code>int</code>
 * depending on whether <code>z()</code>, <code>l()</code>, or <code>i()</code>
 * is called, respectively.
 * The first argument can select a specific version of the function and the second
 * argument is the general parameter. A typical use case would be where the
 * first parameter is the base of the function.
 * Usually it makes sense to extend from <code>AbstractFunction2D</code> rather than
 * directly implementing all methods of this interface.
 * @author Sean A. Irvine
 */
public interface Function2D extends Function1 {

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final long t, final Z n);

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final long t, final long n);

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final long t, final Z n);

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final long t, final long n);

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final long t, final Z n);

  /**
   * Two argument function.
   * @param t parameter
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final long t, final long n);

  /**
   * Return a default for the first parameter.
   * @return default first parameter
   */
  long getDefault();
}

