package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199392 Decimal expansion of x&gt;0 satisfying 3*x^2+2*x*sin(x)=3.
 * Equation; 3*x^2+2*x*sin(x)-(3)
 * @author Georg Fischer
 */
public class A199392 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199392() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(CR.TWO.multiply(x).multiply(x.sin())).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(0.775), CR.valueOf(0.807)).execute(CR.ZERO));
  }
}
