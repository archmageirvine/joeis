package irvine.oeis.a169;
// manually 2024-03-28

import irvine.math.q.Q;
import irvine.math.z.Fibonacci;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A169614 Triangular array: T(n,k)=integer nearest F(n)/F(n-k), k=1,2,...,n-2; n&gt;=3, where F=A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A169614 extends LambdaTriangle {

  /** Construct the sequence. */
  public A169614() {
    super(1, 3, 3, (n, k) -> new Q(Fibonacci.fibonacci(n), Fibonacci.fibonacci(n - k + 2)).round());
  }
}
