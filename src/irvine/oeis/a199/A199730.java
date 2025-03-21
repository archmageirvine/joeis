package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199730 Decimal expansion of x&gt;0 satisfying x^2-3*x*cos(x)=sin(x).
 * Equation; x^2-3*x*cos(x)-(sin(x))
 * @author Georg Fischer
 */
public class A199730 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199730() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.THREE.multiply(x).multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(1.329), CR.valueOf(1.383)).execute(CR.ZERO));
  }
}
