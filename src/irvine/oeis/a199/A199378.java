package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199378 Decimal expansion of x&gt;0 satisfying x^2+3*x*sin(x)=3.
 * Equation; x^2+3*x*sin(x)-(3)
 * @author Georg Fischer
 */
public class A199378 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199378() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.THREE.multiply(x).multiply(x.sin())).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(0.895), CR.valueOf(0.931)).execute(CR.ZERO));
  }
}
