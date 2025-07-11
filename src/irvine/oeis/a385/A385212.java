package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/lambdan at 2025-07-01 16:42

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008966;

/**
 * A385212 a(n) = n^(mu(n)^2), where mu is the M\u00f6bius function (A008683).
 * @author Georg Fischer
 */
public class A385212 extends LambdaSequence {

  private static final DirectSequence A008966 = new A008966();

  /** Construct the sequence. */
  public A385212() {
    super(1, n -> Z.valueOf(n).pow(A008966.a(n)));
  }
}
