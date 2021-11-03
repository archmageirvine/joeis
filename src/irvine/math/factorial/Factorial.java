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

  /**
   * Compute the multi-factorial function. Given <code>n</code> and <code>m</code> return
   * <code>n</code>!...! where there are <code>m</code> exclamation marks.
   *
   * @param n a non-negative integer
   * @param m a positive integer
   * @return <code>n</code>!...! (<code>m</code> times)
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z multiFactorial(int n, int m);
}
