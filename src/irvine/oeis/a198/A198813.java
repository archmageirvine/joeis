package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198813 Decimal expansion of x&gt;0 satisfying x^2+3*cos(x)=4.
 * Equation; x^2+3*cos(x)-(4)
 * @author Georg Fischer
 */
public class A198813 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198813() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.THREE.multiply(x.cos())).subtract(CR.FOUR);
      }
    }.inverseMonotone(CR.valueOf(2.495), CR.valueOf(2.597)).execute(CR.ZERO));
  }
}
