package irvine.oeis.a257;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A257094 Decimal expansion of Gamma(9/4).
 * Formula: Gamma(9/4).
 * @author Georg Fischer
 */
public class A257094 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A257094() {
    super(1, CrFunctions.GAMMA.cr(CR.NINE.divide(CR.FOUR)));
  }
}
