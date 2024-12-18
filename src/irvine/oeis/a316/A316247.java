package irvine.oeis.a316;
// Generated by gen_seq4.pl decsolvn at 2021-08-10 20:45

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A316247 Decimal expansion of the middle x such that 1/x + 1/(x+1) + 1/(x+2) = 3.
 * Equation; 3*x^3+6*x^2-2
 * @author Georg Fischer
 */
public class A316247 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A316247() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(3)).add(CR.SIX.multiply(x.pow(CR.TWO))).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(-0.737), CR.valueOf(-0.708)).execute(CR.ZERO).negate());
  }
}
