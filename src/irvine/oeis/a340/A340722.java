package irvine.oeis.a340;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A340722 Decimal expansion of Gamma(4/5).
 * Formula: Gamma(4/5).
 * @author Georg Fischer
 */
public class A340722 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A340722() {
    super(1, CrFunctions.GAMMA.cr(CR.FOUR.divide(CR.FIVE)));
  }
}
