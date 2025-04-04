package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377752 Decimal expansion of the circumradius of a truncated icosahedron with unit edge length.
 * Formula:
 * @author Georg Fischer
 */
public class A377752 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A377752() {
    super(1, CR.valueOf(58).add(CR.valueOf(18).multiply(CR.FIVE.sqrt())).sqrt().divide(CR.FOUR));
  }
}
