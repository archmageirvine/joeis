package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377798 Decimal expansion of the circumradius of a truncated icosidodecahedron (great rhombicosidodecahedron) with unit edge length.
 * Formula:
 * @author Georg Fischer
 */
public class A377798 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A377798() {
    super(1, CR.valueOf(31).divide(CR.FOUR).add(CR.THREE.multiply(CR.FIVE.sqrt())).sqrt());
  }
}
