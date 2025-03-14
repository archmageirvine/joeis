package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201664 Decimal expansion of least x satisfying 2*x^2 - 1 = csc(x) and 0&lt;x&lt;Pi.
 * Equation; 2*x^2-1-csc(x)
 * @author Georg Fischer
 */
public class A201664 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201664() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.ONE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(1.018), CR.valueOf(1.060)).execute(CR.ZERO));
  }
}
