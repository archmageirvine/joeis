package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200634 Decimal expansion of the greater of two values of x satisfying 6*x^2 - 1 = tan(x) and 0 &lt; x &lt; Pi/2.
 * Equation; 6*x^2-1-(tan(x))
 * @author Georg Fischer
 */
public class A200634 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200634() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.SIX.multiply(x.square()).subtract(CR.ONE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.459), CR.valueOf(1.519)).execute(CR.ZERO));
  }
}
