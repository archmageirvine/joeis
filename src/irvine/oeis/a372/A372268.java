package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372268 Decimal expansion of the largest positive zero of the Legendre polynomial of degree 4.
 * Formula:
 * @author Georg Fischer
 */
public class A372268 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372268() {
    super(0, CR.THREE.add(CR.TWO.multiply(CR.SIX.divide(CR.FIVE).sqrt())).divide(CR.SEVEN).sqrt());
  }
}
