package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Interface for implementations of the factorial function.
 *
 * @author Sean A. Irvine
 */
public interface Factorial {

  /**
   * Compute the factorial function. Given <code>n</code> return
   * <code>n</code>!.
   *
   * @param n a non-negative integer
   * @return <code>n</code>!
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z factorial(int n);

  /**
   * Compute the double factorial function. Given <code>n</code> return
   * <code>n</code>!!.
   *
   * @param n a non-negative integer
   * @return <code>n</code>!!
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z doubleFactorial(int n);
}
