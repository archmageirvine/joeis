package irvine.oeis.a345;
// Generated by gen_seq4.pl 2025-07-25.ack/decexpr at 2025-07-25 21:47

import irvine.math.cr.ComputableReals;
import irvine.oeis.a240.A240358;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A345737 Decimal expansion of the initial angle in radians above the horizon that maximizes the length of a projectile's trajectory.
 * Formula:
 * @author Georg Fischer
 */
public class A345737 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A240358 = new A240358();

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A345737() {
    super(0, REALS.atan(A240358.getCR()));
  }
}
