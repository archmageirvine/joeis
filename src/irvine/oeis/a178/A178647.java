package irvine.oeis.a178;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A178647 Decimal expansion of the fraction of a population falling within +- 1 standard deviation of the mean, assuming a normal distribution.
 * Formula:
 * @author Georg Fischer
 */
public class A178647 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A178647() {
    super(0, CrFunctions.ERF.cr(CR.ONE.divide(CR.SQRT2)));
  }
}
