package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolvn at 2021-08-09 18:13

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198365 Decimal expansion of least x having 4*x^2+3x=3*cos(x).
 * Equation; 4*x^2+3*x-3*cos(x)
 * @author Georg Fischer
 */
public class A198365 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198365() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).add(CR.THREE.multiply(x)).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(-1.1), CR.valueOf(-1.056)).execute(CR.ZERO).negate());
  }
}
