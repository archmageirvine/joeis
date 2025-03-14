package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198346 Decimal expansion of greatest x having 3*x^2-4x=-cos(x).
 * Equation; 3*x^2-4x-(-cos(x))
 * @author Georg Fischer
 */
public class A198346 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198346() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.FOUR.multiply(x)).subtract(x.cos().negate());
      }
    }.inverseMonotone(CR.valueOf(1.223), CR.valueOf(1.273)).execute(CR.ZERO));
  }
}
