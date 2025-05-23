package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198501 Decimal expansion of x&gt;0 having 3*x^2=sin(x).
 * Equation; 3*x^2-(sin(x))
 * @author Georg Fischer
 */
public class A198501 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198501() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(0.321), CR.valueOf(0.334)).execute(CR.ZERO));
  }
}
