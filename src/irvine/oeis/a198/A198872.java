package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198872 Decimal expansion of x&gt;0 satisfying 2*x^2-cos(x)=2.
 * Equation; 2*x^2-cos(x)-(2)
 * @author Georg Fischer
 */
public class A198872 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198872() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(x.cos()).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(1.084), CR.valueOf(1.128)).execute(CR.ZERO));
  }
}
