package irvine.oeis.a169;
// manually 2024-03-28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A169613 Triangular array: T(n,k)=floor(F(n)/F(n-k)), k=1,2,...,n-2; n&gt;=3, where F=A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A169613 extends LambdaTriangle {

  /** Construct the sequence. */
  public A169613() {
    super(3, 3, 3, (n, k) -> {
      return new Q(Functions.FIBONACCI.z((long) n), Functions.FIBONACCI.z((long) (n - k + 2))).floor();
    });
  }
}
