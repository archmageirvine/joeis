package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198995 Decimal expansion of x&gt;0 satisfying 4*x^2-3*cos(x)=-1.
 * Equation; 4*x^2-3*cos(x)-(-1)
 * @author Georg Fischer
 */
public class A198995 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198995() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(CR.THREE.multiply(x.cos())).subtract(CR.ONE.negate());
      }
    }.inverseMonotone(CR.valueOf(0.593), CR.valueOf(0.618)).execute(CR.ZERO));
  }
}
