package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201563 Decimal expansion of greatest x satisfying x^2 + 1 = csc(x) and 0 &lt; x &lt; Pi.
 * Equation; x^2+1-csc(x)
 * @author Georg Fischer
 */
public class A201563 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201563() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.ONE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.valueOf(2.983), CR.valueOf(3.105)).execute(CR.ZERO));
  }
}
