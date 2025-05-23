package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200616 Decimal expansion of the lesser of two values of x satisfying 4*x^2 - 1 = tan(x) and 0 &lt; x &lt; Pi/2.
 * Equation; 4*x^2-1-(tan(x))
 * @author Georg Fischer
 */
public class A200616 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200616() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(CR.ONE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(0.656), CR.valueOf(0.682)).execute(CR.ZERO));
  }
}
