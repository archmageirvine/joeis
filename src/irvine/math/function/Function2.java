package irvine.math.function;

import irvine.math.z.Z;

/**
 * A two argument integer function.
 * Several methods are defined but all should return the exact same function
 * (apart with differences in supported range of inputs and output).
 * The return type can be <code>Z</code>, <code>long</code>, or <code>int</code>
 * depending on whether <code>z()</code>, <code>l()</code>, or <code>i()</code>
 * is called, respectively.
 * Usually it makes sense to extend from <code>AbstractFunction2</code> rather than
 * directly implementing all methods of this interface.
 * @author Sean A. Irvine
 */
public interface Function2 {

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final Z n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final long n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final Z n, final long m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  Z z(final long n, final long m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final Z n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final long n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final Z n, final long m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  long l(final long n, final long m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final Z n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final long n, final Z m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final Z n, final long m);

  /**
   * Two argument function.
   * @param n parameter
   * @param m parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  int i(final long n, final long m);
}

