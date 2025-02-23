package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200128 Decimal expansion of least x satisfying 2*x^2 - 4*cos(x) = sin(x), negated.
 * Equation; 2*x^2-4*cos(x)-sin(x)
 * @author Georg Fischer
 */
public class A200128 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200128() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.FOUR.multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(-0.929), CR.valueOf(-0.893)).execute(CR.ZERO).negate());
  }
}
