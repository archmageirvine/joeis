package irvine.oeis.a099;
// Generated by gen_seq4.pl 2025-05-11.ack/decexp at 2025-05-11 22:56

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099223 Decimal expansion of Li_9(1/2).
 * Formula: ((\d+), (\d+)/(\d+))
 * @author Georg Fischer
 */
public class A099223 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A099223() {
    super(0, CrFunctions.POLYLOG.cr(9, CR.HALF));
  }
}
