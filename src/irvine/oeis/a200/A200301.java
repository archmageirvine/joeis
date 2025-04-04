package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200301 Decimal expansion of least x satisfying 4*x^2 - 3*cos(x) = 3*sin(x), negated.
 * Equation; 4*x^2-3*cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A200301 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200301() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(CR.THREE.multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(-0.534), CR.valueOf(-0.513)).execute(CR.ZERO).negate());
  }
}
