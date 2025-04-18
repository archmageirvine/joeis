package irvine.oeis.a203;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A203131 Decimal expansion of (5/6)! = Gamma(11/6).
 * Formula: Gamma(11/6)
 * @author Georg Fischer
 */
public class A203131 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A203131() {
    super(0, CrFunctions.GAMMA.cr(CR.valueOf(11).divide(CR.SIX)));
  }
}
