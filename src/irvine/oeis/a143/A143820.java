package irvine.oeis.a143;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A143820 Decimal expansion of the constant 1/1! + 1/4! + 1/7! + ...
 * Formula:
 * @author Georg Fischer
 */
public class A143820 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A143820() {
    super(1, CR.ONE.exp().add(CR.TWO.multiply(CR.ZERO.subtract(CR.HALF).exp()).multiply(CR.THREE.sqrt().divide(CR.TWO).subtract(CR.TWO.multiply(CR.PI).divide(CR.THREE)).cos())).divide(CR.THREE));
  }
}
