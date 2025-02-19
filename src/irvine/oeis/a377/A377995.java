package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-06.ack/decexpr at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377995 Decimal expansion of the dihedral angle, in radians, between square and pentagonal faces in a (small) rhombicosidodecahedron.
 * Formula:
 * @author Georg Fischer
 */
public class A377995 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A377995() {
    super(1, REALS.acos(CR.ZERO.subtract(CR.FIVE.add(CR.FIVE.sqrt()).divide(CR.TEN).sqrt())));
  }
}
