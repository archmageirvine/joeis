package irvine.oeis.a048;
// Generated by gen_seq4.pl 2025-03-23.ack/trilambn at 2025-03-23 22:08

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A048594 Triangle T(n,k) = k! * Stirling1(n,k), 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A048594 extends LambdaTriangle {

  /** Construct the sequence. */
  public A048594() {
    super(1, 1, 1, (n, k) -> Functions.STIRLING1.z(n, k).multiply(Functions.FACTORIAL.z(k)));
  }
}
