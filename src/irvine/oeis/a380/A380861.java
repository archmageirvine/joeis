package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-03-02.ack/decexpr at 2025-03-02 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A380861 Decimal expansion of the smallest acute vertex angle, in radians, in a deltoidal hexecontahedron face.
 * Formula: arccos((9*sqrt(5) - 5)/40)
 * @author Georg Fischer
 */
public class A380861 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A380861() {
    super(1, REALS.acos(CR.FIVE.sqrt().multiply(9).subtract(5).divide(40)));
  }
}
