package irvine.oeis.a348;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A348670 Decimal expansion of 10 - Pi^2.
 * Formula:
 * @author Georg Fischer
 */
public class A348670 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A348670() {
    super(0, CR.TEN.subtract(CR.PI.square()));
  }
}
