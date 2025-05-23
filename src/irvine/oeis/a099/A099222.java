package irvine.oeis.a099;
// Generated by gen_seq4.pl 2025-05-11.ack/decexp at 2025-05-11 22:56

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099222 Decimal expansion of Li_8(1/2).
 * Formula: ((\d+), (\d+)/(\d+))
 * @author Georg Fischer
 */
public class A099222 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A099222() {
    super(0, CrFunctions.POLYLOG.cr(8, CR.HALF));
  }
}
