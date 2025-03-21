package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolvn at 2021-08-01 19:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198607 Decimal expansion of x &lt; 0 satisfying 3*x^2 + 4*x = 2*sin(x).
 * Equation; 3*x^2+4*x-2*sin(x)
 * @author Georg Fischer
 */
public class A198607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198607() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(CR.FOUR.multiply(x)).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(-0.738), CR.valueOf(-0.709)).execute(CR.ZERO).negate());
  }
}
