package irvine.oeis.a099;
// Generated by gen_seq4.pl 2025-04-30.ack/decexp at 2025-04-30 23:37

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099283 Decimal expansion of the hyperbolic sine integral at 1.
 * Formula: Decimal expansion of the hyperbolic sine integral at 1.
 * @author Georg Fischer
 */
public class A099283 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A099283() {
    super(1, CrFunctions.SHI.cr(CR.ONE));
  }
}
