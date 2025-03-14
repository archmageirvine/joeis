package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198431 Decimal expansion of x&gt;0 having x^2-3x=sin(x).
 * Equation; x^2-3x-(sin(x))
 * @author Georg Fischer
 */
public class A198431 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198431() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.THREE.multiply(x)).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(2.974), CR.valueOf(3.096)).execute(CR.ZERO));
  }
}
