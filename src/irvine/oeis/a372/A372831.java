package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372831 Decimal expansion of (16 + 5*sqrt(2))/15.
 * Formula:
 * @author Georg Fischer
 */
public class A372831 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372831() {
    super(1, CR.valueOf(16).add(CR.FIVE.multiply(CR.SQRT2)).divide(CR.valueOf(15)));
  }
}
