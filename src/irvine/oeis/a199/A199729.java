package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199729 Decimal expansion of x&gt;0 satisfying x^2-3*x*cos(x)=2*sin(x).
 * Equation; x^2-3*x*cos(x)-(2*sin(x))
 * @author Georg Fischer
 */
public class A199729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199729() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.THREE.multiply(x).multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.478), CR.valueOf(1.538)).execute(CR.ZERO));
  }
}
