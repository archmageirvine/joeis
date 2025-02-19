package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A374753 Decimal expansion of the volume of a regular dodecahedron having unit inradius.
 * Formula:
 * @author Georg Fischer
 */
public class A374753 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A374753() {
    super(1, CR.TEN.multiply(CR.valueOf(130).subtract(CR.valueOf(58).multiply(CR.FIVE.sqrt())).sqrt()));
  }
}
