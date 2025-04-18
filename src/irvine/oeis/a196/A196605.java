package irvine.oeis.a196;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196605 Decimal expansion of the least x&gt;0 satisfying sec(x)=4x.
 * Equation; sec(x)-4*x
 * @author Georg Fischer
 */
public class A196605 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A196605() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return REALS.sec(x).subtract(CR.FOUR.multiply(x));
      }
    }.inverseMonotone(CR.valueOf(0.253), CR.valueOf(0.264)).execute(CR.ZERO));
  }
}
