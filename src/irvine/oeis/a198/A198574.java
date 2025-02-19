package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198574 Decimal expansion of x&gt;0 satisfying 4*x^2-3x=2*sin(x).
 * Equation; 4*x^2-3x-(2*sin(x))
 * @author Georg Fischer
 */
public class A198574 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198574() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.FOUR.multiply(x.square()).subtract(CR.THREE.multiply(x)).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.124), CR.valueOf(1.170)).execute(CR.ZERO));
  }
}
