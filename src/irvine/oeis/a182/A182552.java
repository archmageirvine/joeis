package irvine.oeis.a182;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182552 Decimal expansion of phi^(1/e), where phi is the golden ratio.
 * Formula: phi^(1/e)
 * @author Georg Fischer
 */
public class A182552 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182552() {
    super(1, CR.PHI.pow(CR.ONE.divide(CR.E)));
  }
}
