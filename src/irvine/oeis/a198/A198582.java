package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198582 Decimal expansion of x&gt;0 satisfying 3*x^2-4x=4*sin(x).
 * Equation; 3*x^2-4x-(4*sin(x))
 * @author Georg Fischer
 */
public class A198582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198582() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.FOUR.multiply(x)).subtract(CR.FOUR.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.922), CR.valueOf(2.000)).execute(CR.ZERO));
  }
}
