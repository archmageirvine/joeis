package irvine.oeis.a086;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086751 Decimal expansion of the solution to x*sqrt(1-x^2) + arcsin(x) = Pi/4, or the length of the line connecting the origin to the center of the chord of a circle, centered at 0 and of radius 1, that divides the circle such that 1/4 of the area is on one side and 3/4 is on the other side.
 * Equation; x*sqrt(1-x^2)+arcsin(x)-(Pi/4)
 * @author Georg Fischer
 */
public class A086751 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A086751() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(CR.ONE.subtract(x.square()).sqrt()).add(REALS.asin(x)).subtract(CR.PI.divide(CR.FOUR));
      }
    }.inverseMonotone(CR.valueOf(0.396), CR.valueOf(0.412)).execute(CR.ZERO));
  }
}
