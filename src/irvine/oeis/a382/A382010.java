package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-03-23.ack/decexp at 2025-03-23 22:08

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382010 Decimal expansion of the isoperimetric quotient of a pentakis dodecahedron.
 * Formula:
 * @author Georg Fischer
 */
public class A382010 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A382010() {
    super(0, CR.PI.multiply(3).divide(545).multiply((CR.FIVE.sqrt()).multiply(143289).add(323309).divide(218).sqrt()));
  }
}
