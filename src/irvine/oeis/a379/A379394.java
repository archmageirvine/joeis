package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-06.ack/decexpr at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A379394 Decimal expansion of the area of the convex hull of a circle of circumference 1 and a line segment of length 1/2 with midpoint at the circle center.
 * @author Georg Fischer
 */
public class A379394 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A379394() {
    super(0, CR.PI.square().subtract(CR.FOUR).sqrt().add(CR.PI).subtract(CR.TWO.multiply(REALS.acos(CR.TWO.divide(CR.PI)))).divide(CR.FOUR.multiply(CR.PI.square())));
  }
}
