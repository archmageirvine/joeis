package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198101 Decimal expansion of greatest x having x^2-4x=-2*cos(x).
 * Equation; x^2-4x-(-2*cos(x))
 * @author Georg Fischer
 */
public class A198101 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198101() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.FOUR.multiply(x)).subtract(CR.TWO.multiply(x.cos()).negate());
      }
    }.inverseMonotone(CR.valueOf(4.138), CR.valueOf(4.306)).execute(CR.ZERO));
  }
}
