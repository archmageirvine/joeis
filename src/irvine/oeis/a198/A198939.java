package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198939 Decimal expansion of x&gt;0 satisfying 3*x^2-4*cos(x)=1.
 * Equation; 3*x^2-4*cos(x)-(1)
 * @author Georg Fischer
 */
public class A198939 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198939() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.FOUR.multiply(x.cos())).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.997), CR.valueOf(1.037)).execute(CR.ZERO));
  }
}
