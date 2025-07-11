package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-27.ack/decexp at 2025-05-27 23:49

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384143 Decimal expansion of the volume of an elongated triangular cupola with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A384143 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A384143() {
    super(1, CR.FIVE.multiply(CR.SQRT2).add(CR.NINE.multiply(CR.THREE.sqrt())).divide(CR.SIX));
  }
}
