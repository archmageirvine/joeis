package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolvn at 2021-08-09 18:13

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198361 Decimal expansion of least x having 4*x^2+3x=cos(x).
 * Equation; 4*x^2+3*x-cos(x)
 * @author Georg Fischer
 */
public class A198361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198361() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).add(CR.THREE.multiply(x)).subtract(x.cos());
      }
    }.inverseMonotone(CR.valueOf(-0.934), CR.valueOf(-0.898)).execute(CR.ZERO).negate());
  }
}
