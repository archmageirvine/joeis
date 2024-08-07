package irvine.oeis.a329;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a323.A323244;

/**
 * A329639 Sum of -A329644(d) for all such divisors d of n for which A329644(d) &lt; 0. Here A329644 is the M\u00f6bius transform of A323244, the deficiency of A156552(n).
 * @author Georg Fischer
 */
public class A329639 extends LambdaSequence {

  private static final DirectSequence A323244 = new A323244();
  private static final DirectSequence A329638 = new A329638();

  /** Construct the sequence. */
  public A329639() {
    super(1, n -> A329638.a(n).subtract(A323244.a(n)));
  }
}
