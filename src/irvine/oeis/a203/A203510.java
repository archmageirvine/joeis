package irvine.oeis.a203;
// Generated by gen_seq4.pl quots/quot at 2021-11-28 22:56

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203510 a(n) = A203482(n) / A000178(n).
 * @author Georg Fischer
 */
public class A203510 extends QuotientSequence {

  /** Construct the sequence. */
  public A203510() {
    super(new A203482(), new A000178());
  }
}
