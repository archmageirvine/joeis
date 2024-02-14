package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Interface for implementations of the factorial function.
 * @author Sean A. Irvine
 */
public interface Factorial {

  /**
   * Convenience array of all factorials which fit into a long.
   * It is critical that users of this array do not modify it in any way.
   */
  long[] FACTORIAL = {1, 1, 2, 6, 24,
    120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L,
    20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L // 20!
  };


  /**
   * Compute the factorial function. Given <code>n</code> return <code>n!</code>.
   * @param n a non-negative integer
   * @return <code>n</code>!
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z factorial(int n);

  /**
   * Compute the double factorial function. Given <code>n</code> return
   * <code>n</code>!!.
   * @param n a non-negative integer
   * @return <code>n</code>!!
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z doubleFactorial(int n);

  /**
   * Compute the multi-factorial function. Given <code>n</code> and <code>m</code> return
   * <code>n</code>!...! where there are <code>m</code> exclamation marks.
   * @param n a non-negative integer
   * @param m a positive integer
   * @return <code>n</code>!...! (<code>m</code> times)
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   */
  Z multiFactorial(int n, int m);
}
