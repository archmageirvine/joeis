package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A008279 Triangle T(n,k) = n!/(n-k)! (0 &lt;= k &lt;= n) read by rows, giving number of permutations of n things k at a time.
 * This is the function <code>fallfac(n, k)</code>.
 * @author Georg Fischer
 */
public class A008279 extends LambdaTriangle implements DirectArray {

  /** Construct the sequence. */
  public A008279() {
    super(0, 0, 0, (n, k) -> MemoryFactorial.SINGLETON.factorial(n).divide(MemoryFactorial.SINGLETON.factorial(n - k)));
  }
}

