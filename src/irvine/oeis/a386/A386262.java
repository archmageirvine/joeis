package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-26.ack/lambdan at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a051.A051903;

/**
 * A386262 a(n) = A051903(A051903(n)) for n &gt;= 2, a(1) = 0.
 * @author Georg Fischer
 */
public class A386262 extends LambdaSequence {

  private static final DirectSequence A051903 = new A051903();

  /** Construct the sequence. */
  public A386262() {
    super(1, n -> n == 1 ? Z.ZERO : A051903.a(A051903.a(n)));
  }
}
