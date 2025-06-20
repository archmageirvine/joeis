package irvine.oeis.a160;
// Generated by gen_seq4.pl 2025-06-01.ack/lambdan at 2025-06-01 21:15

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005408;

/**
 * A160145 a(n) = the odd number 2n+1 minus the numerator of (2n+1)/(2^(2n+1)-1).
 * @author Georg Fischer
 */
public class A160145 extends LambdaSequence {

  private static final DirectSequence A005408 = new A005408();
  private static final DirectSequence A160144 = new A160144();

  /** Construct the sequence. */
  public A160145() {
    super(0, n -> A005408.a(n).subtract(A160144.a(n)));
  }
}
