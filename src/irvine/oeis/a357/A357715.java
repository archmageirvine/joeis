package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-06-09/decexp at 2024-06-09 23:02

import irvine.math.cr.CR;
import irvine.oeis.a019.A019934;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A357715 Decimal expansion of sqrt(16 + 32 / sqrt(5)).
 * Formula:
 * @author Georg Fischer
 */
public class A357715 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A357715() {
    super(1, CR.FOUR.divide(new A019934().getCR()));
  }
}
