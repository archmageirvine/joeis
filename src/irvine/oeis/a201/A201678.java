package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201678 Decimal expansion of least x satisfying 9*x^2 - 1 = csc(x) and 0&lt;x&lt;Pi.
 * Equation; 9*x^2-1-csc(x)
 * @author Georg Fischer
 */
public class A201678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201678() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.NINE.multiply(x.square()).subtract(CR.ONE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(0.553), CR.valueOf(0.576)).execute(CR.ZERO));
  }
}
