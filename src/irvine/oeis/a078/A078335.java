package irvine.oeis.a078;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078335 Decimal expansion of largest real root of e^x = Gamma(x+1).
 * Equation; e^x-(Gamma(x+1))
 * @author Georg Fischer
 */
public class A078335 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078335() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.E.pow(x).subtract(CrFunctions.GAMMA.cr(x.add(CR.ONE)));
      }
    }.inverseMonotone(CR.valueOf(5.184), CR.valueOf(5.396)).execute(CR.ZERO));
  }
}
