package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378974 Decimal expansion of the volume of a triakis icosahedron with unit shorter edge length.
 * Formula:
 * @author Georg Fischer
 */
public class A378974 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A378974() {
    super(2, CR.valueOf(19).add(CR.valueOf(13).multiply(CR.FIVE.sqrt())).divide(CR.FOUR));
  }
}
