package irvine.oeis.a292;
// manually at 2024-03-28

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A292930 Triangle read by rows: T(n,k) (n&gt;=1, 3&lt;=k&lt;=n+2) is the number of k-sequences of balls colored with at most n colors such that exactly three balls are the same color as some other ball in the sequence.
 * @author Georg Fischer
 */
public class A292930 extends LambdaTriangle {

  /** Construct the sequence. */
  public A292930() {
    super(1, 1, 1, (n, k) -> Binomial.binomial(k + 2, 3).multiply(MemoryFactorial.SINGLETON.factorial(n)).divide(MemoryFactorial.SINGLETON.factorial(n - k)));
  }
}
