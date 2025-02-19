package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-12-01.ack/decexp at 2024-12-01 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A353781 Decimal expansion of log(sin(2)/2) (negated).
 * Formula: log(sin(2)/2) (negated)
 * @author Georg Fischer
 */
public class A353781 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A353781() {
    super(0, CR.TWO.sin().divide(2).log().negate());
  }
}
