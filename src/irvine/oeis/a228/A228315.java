package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-07-13.ack/trilambn at 2025-07-13 21:23

import irvine.math.z.Binomial;
import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001187;
import irvine.oeis.a006.A006125;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A228315 Triangular array read by rows: T(n,k) is the number of rooted labeled simple graphs on {1,2,...,n} such that the root is in a component of size k; n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A228315 extends LambdaTriangle {

  private static final DirectSequence A006125 = new A006125();
  private static final MemorySequence A001187 = new A001187();

  /** Construct the sequence. */
  public A228315() {
    super(1, 1, 1, (n, k) -> Binomial.binomial(n, k).multiply(k).multiply(A001187.a(k)).multiply(A006125.a(n - k)));
  }
}
