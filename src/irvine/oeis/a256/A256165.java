package irvine.oeis.a256;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A256165 Decimal expansion of log(Gamma(1/3)).
 * Formula: log(Gamma(1/3)).
 * @author Georg Fischer
 */
public class A256165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A256165() {
    super(0, CR.ONE.divide(CR.THREE).lnGamma());
  }
}
