package irvine.oeis.a240;
// Generated by gen_seq4.pl decsolv at 2021-08-11 21:56

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A240723 Decimal expansion of a constant linked to a normal distribution inequality.
 * Equation; erf(x/sqrt(2))-sqrt(1-sqrt(2/Pi))
 * @author Georg Fischer
 */
public class A240723 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A240723() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CrFunctions.ERF.cr(x.divide(CR.SQRT2)).subtract(CR.ONE.subtract(CR.TWO.divide(CR.PI).sqrt()).sqrt());
      }
    }.inverseMonotone(CR.valueOf(0.585), CR.valueOf(0.609)).execute(CR.ZERO));
  }
}
