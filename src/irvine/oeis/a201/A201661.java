package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201661 Decimal expansion of least x satisfying x^2 - 1 = csc(x) and 0&lt;x&lt;Pi.
 * Equation; x^2-1-csc(x)
 * @author Georg Fischer
 */
public class A201661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201661() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.ONE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(1.390), CR.valueOf(1.446)).execute(CR.ZERO));
  }
}
