package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201587 Decimal expansion of least x satisfying 4*x^2 = csc(x) and 0 &lt; x &lt; Pi.
 * Equation; 4*x^2-csc(x)
 * @author Georg Fischer
 */
public class A201587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201587() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(0.632), CR.valueOf(0.658)).execute(CR.ZERO));
  }
}
