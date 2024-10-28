package irvine.oeis.a201;
// maually decsolvn at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201937 Decimal expansion of the greatest negative number x satisfying 2*x^2=e^(-x).
 * Equation; 2*x^2-(e^(-x))
 * @author Georg Fischer
 */
public class A201937 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201937() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.E.pow(x.negate()));
      }
    }.inverseMonotone(CR.valueOf(-1.489), CR.valueOf(-1.485)).execute(CR.ZERO).negate());
  }
}
