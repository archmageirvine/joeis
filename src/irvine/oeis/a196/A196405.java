package irvine.oeis.a196;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196405 Decimal expansion of the least positive number x satisfying e^(-x)=5*cos(x).
 * Equation; 1/exp(x)-5*cos(x)
 * @author Georg Fischer
 */
public class A196405 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196405() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.ONE.divide(x.exp()).subtract(CR.FIVE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(1.496), CR.valueOf(1.558)).execute(CR.ZERO));
  }
}
