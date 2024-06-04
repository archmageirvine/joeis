package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A008279 Triangle T(n,k) = n!/(n-k)! (0 &lt;= k &lt;= n) read by rows, giving number of permutations of n things k at a time.
 * This is the function <code>fallfac(n, k)</code>.
 * @author Georg Fischer
 */
public class A008279 extends LambdaTriangle {

  /** Construct the sequence. */
  public A008279() {
    super(0, 0, 0, (n, k) -> Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(n - k)));
  }
}

