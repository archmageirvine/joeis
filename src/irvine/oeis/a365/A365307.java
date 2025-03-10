package irvine.oeis.a365;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A365307 Decimal expansion of 1/(2*e-5).
 * Formula:
 * @author Georg Fischer
 */
public class A365307 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A365307() {
    super(1, CR.ONE.divide(CR.TWO.multiply(CR.E).subtract(CR.FIVE)));
  }
}
