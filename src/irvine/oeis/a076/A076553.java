package irvine.oeis.a076;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076553 Decimal expansion of the solution of agm(x,2) = 1.
 * Equation; agm(x, 2)-1
 * @author Georg Fischer
 */
public class A076553 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A076553() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.agm(CR.TWO).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.344), CR.valueOf(0.359)).execute(CR.ZERO));
  }
}
