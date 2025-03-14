package irvine.oeis.a241;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A241517 Decimal expansion of the positive solution to log(x)/x == -3*Pi/2.
 * Equation; log(x)/x+3*Pi/2
 * @author Georg Fischer
 */
public class A241517 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A241517() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.log().divide(x).add(CR.THREE.multiply(CR.PI).divide(CR.TWO));
      }
    }.inverseMonotone(CR.valueOf(0.269), CR.valueOf(0.280)).execute(CR.ZERO));
  }
}
