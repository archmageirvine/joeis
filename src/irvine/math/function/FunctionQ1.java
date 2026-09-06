package irvine.math.function;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A one argument rational function.
 * @author Sean A. Irvine
 */
public interface FunctionQ1 {

  /**
   * Function.
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Q q(final Z n);

  /**
   * Function.
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Q q(final long n);

  /**
   * Function.
   * @param n parameter
   * @return function value
   * @throws ArithmeticException if the result cannot be represented.
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  Q q(final int n);
}

