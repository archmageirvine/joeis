package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-08.ack/decexpr at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A380704 Decimal expansion of the acute vertex angles, in radians, in a deltoidal icositetrahedron face.
 * Formula:
 * @author Georg Fischer
 */
public class A380704 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A380704() {
    super(1, REALS.acos(CR.HALF.subtract(CR.SQRT2.divide(CR.FOUR))));
  }
}
