package irvine.oeis.a335;
// Generated by gen_seq4.pl decexpr at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A335605 Decimal expansion of arctan(log(phi)/(Pi/2)), the polar slope angle (in radians) of the golden spiral.
 * @author Georg Fischer
 */
public class A335605 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A335605() {
    super(0, REALS.atan(CR.PHI.log().divide(CR.PI.divide(CR.TWO))));
  }
}
