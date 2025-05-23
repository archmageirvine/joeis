package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-01 19:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199156 Decimal expansion of x &lt; 0 satisfying 3*x^2+2*sin(x) = 3.
 * Equation; 3*x^2+2*sin(x)-3
 * @author Georg Fischer
 */
public class A199156 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199156() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(CR.TWO.multiply(x.sin())).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(-1.306), CR.valueOf(-1.254)).execute(CR.ZERO).negate());
  }
}
