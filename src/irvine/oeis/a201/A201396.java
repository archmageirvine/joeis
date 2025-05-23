package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201396 Decimal expansion of the number x satisfying x^2+x+2=e^x.
 * Equation; x^2+x+2-(e^x)
 * @author Georg Fischer
 */
public class A201396 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201396() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(x).add(CR.TWO).subtract(CR.E.pow(x));
      }
    }.inverseMonotone(CR.valueOf(2.160), CR.valueOf(2.248)).execute(CR.ZERO));
  }
}
