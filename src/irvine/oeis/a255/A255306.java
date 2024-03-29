package irvine.oeis.a255;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A255306 Decimal expansion of log(Gamma(1/8)).
 * Formula: log(Gamma(1/8))
 * @author Georg Fischer
 */
public class A255306 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A255306() {
    super(1, CR.ONE.divide(CR.EIGHT).lnGamma());
  }
}
