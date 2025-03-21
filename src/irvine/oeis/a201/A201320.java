package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201320 Decimal expansion of x satisfying 2*x^2 - 1 = cot(x) and 0 &lt; x &lt; Pi.
 * Equation; 2*x^2-1-(cot(x))
 * @author Georg Fischer
 */
public class A201320 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A201320() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.ONE).subtract(REALS.cot(x));
      }
    }.inverseMonotone(CR.valueOf(0.914), CR.valueOf(0.952)).execute(CR.ZERO));
  }
}
