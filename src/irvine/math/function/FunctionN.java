package irvine.math.function;

import java.util.Collection;

import irvine.math.z.Z;

/**
 * An aggregating function with a variable number of arguments.
 * Several methods are defined but all should return the exact same function
 * (apart with differences in supported range of inputs and output).
 * The return type can be <code>Z</code>, <code>long</code>, or <code>int</code>
 * depending on whether <code>z()</code>, <code>l()</code>, or <code>i()</code>
 * is called, respectively.
 * Usually it makes sense to extend from <code>AbstractFunctionN</code> rather than
 * directly implementing all methods of this interface.
 * @author Sean A. Irvine
 */
public interface FunctionN {

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Z z(final Collection<Z> values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Z z(final Z... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Z z(final long... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Z z(final int... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  long l(final Z... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  long l(final long... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  long l(final int... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  int i(final Z... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  int i(final long... values);

  /**
   * Function.
   * @param values parameters
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  int i(final int... values);
}

