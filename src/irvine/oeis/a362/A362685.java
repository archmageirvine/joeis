package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-02-20.ack/trilambn at 2025-02-20 23:05

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A362685 Triangle of numbers read by rows, T(n, k) = (n*(n-1))*Stirling2(k, 2), for n &gt;= 1 and 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A362685 extends LambdaTriangle {

  /** Construct the sequence. */
  public A362685() {
    super(1, 1, 1, (n, k) -> Functions.STIRLING2.z(k, 2).multiply(n).multiply(n - 1));
  }
}
