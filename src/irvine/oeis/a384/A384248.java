package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A384248 The sum of the integers from 1 to n whose largest divisor that is an infinitary divisor of n is 1.
 * @author Georg Fischer
 */
public class A384248 extends LambdaSequence {

  private static final DirectSequence A384247 = new A384247();

  /** Construct the sequence. */
  public A384248() {
    super(1, n -> (n <= 1) ? Z.ONE : new Q(n).multiply(A384247.a(n)).divide(2).num());
  }
}
