package irvine.oeis.a203;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A203080 Decimal expansion of (1/16)! = Gamma(17/16).
 * Formula: Gamma(17/16)
 * @author Georg Fischer
 */
public class A203080 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A203080() {
    super(0, CrFunctions.GAMMA.cr(CR.valueOf(17).divide(CR.valueOf(16))));
  }
}
