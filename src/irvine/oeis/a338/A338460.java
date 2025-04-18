package irvine.oeis.a338;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A338460 Decimal expansion of the largest real root of e^(x-1) = Gamma(x+1).
 * Equation; e^(x-1)-(Gamma(x+1))
 * @author Georg Fischer
 */
public class A338460 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A338460() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.E.pow(x.subtract(CR.ONE)).subtract(CrFunctions.GAMMA.cr(x.add(CR.ONE)));
      }
    }.inverseMonotone(CR.valueOf(3.542), CR.valueOf(3.686)).execute(CR.ZERO));
  }
}
