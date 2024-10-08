package irvine.oeis.a121;
// Generated by gen_seq4.pl 2024-09-29.ack/trilambn at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003266;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A121284 Triangle T(n,k), 1&lt;=k&lt;=n, read by rows given by T(n,k) = A003266(n)/A000045(k).
 * @author Georg Fischer
 */
public class A121284 extends LambdaTriangle {

  private static final DirectSequence A003266 = new A003266();

  /** Construct the sequence. */
  public A121284() {
    super(1, 1, 1, (n, k) -> A003266.a(n).divide(Functions.FIBONACCI.z(k)));
  }
}
