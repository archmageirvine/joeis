package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200232 Decimal expansion of greatest x satisfying 3*x^2-2*cos(x)=2*sin(x).
 * Equation; 3*x^2-2*cos(x)-2*sin(x)
 * @author Georg Fischer
 */
public class A200232 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200232() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.TWO.multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.944), CR.valueOf(0.982)).execute(CR.ZERO));
  }
}
