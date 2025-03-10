package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200346 Decimal expansion of least x&gt;0 satisfying x^2+2x+1=tan(x).
 * Equation; x^2+2x+1-(tan(x))
 * @author Georg Fischer
 */
public class A200346 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200346() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.TWO.multiply(x)).add(CR.ONE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.370), CR.valueOf(1.426)).execute(CR.ZERO));
  }
}
