package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201580 Decimal expansion of greatest x satisfying x^2 + 9 = csc(x) and 0 &lt; x &lt; Pi.
 * Equation; x^2+9-csc(x)
 * @author Georg Fischer
 */
public class A201580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201580() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.NINE).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.THREE, CR.valueOf(3.14)).execute(CR.ZERO));
  }
}
