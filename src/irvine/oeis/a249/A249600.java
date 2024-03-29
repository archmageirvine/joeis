package irvine.oeis.a249;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A249600 Decimal expansion of 1/phi + 1/phi^3 + 1/phi^5, where phi is the Golden Ratio.
 * Formula: 1/phi+1/phi^3+1/phi^5
 * @author Georg Fischer
 */
public class A249600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A249600() {
    super(0, CR.ONE.divide(CR.PHI).add(CR.ONE.divide(CR.PHI.pow(CR.THREE))).add(CR.ONE.divide(CR.PHI.pow(CR.FIVE))));
  }
}
