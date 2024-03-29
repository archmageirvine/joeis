package irvine.oeis.a203;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A203141 Decimal expansion of Gamma(5/48).
 * Formula: Gamma(5/48)
 * @author Georg Fischer
 */
public class A203141 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A203141() {
    super(1, CR.FIVE.divide(CR.valueOf(48)).gamma());
  }
}
