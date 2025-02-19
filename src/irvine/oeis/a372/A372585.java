package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372585 Decimal expansion of (25/297)*Pi^2.
 * Formula:
 * @author Georg Fischer
 */
public class A372585 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372585() {
    super(0, CR.valueOf(25).divide(CR.valueOf(297)).multiply(CR.PI.square()));
  }
}
