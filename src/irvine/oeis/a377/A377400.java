package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-03.ack/decexp at 2025-02-03 18:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377400 Decimal expansion of e*(gamma - Ei(-1))/2.
 * Formula: e*(gamma-Ei(-1))/2
 * @author Georg Fischer
 */
public class A377400 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A377400() {
    super(1, CR.E.multiply(CR.GAMMA.subtract(CrFunctions.EI.cr(CR.ZERO.subtract(CR.ONE)))).divide(CR.TWO));
  }
}
