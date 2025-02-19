package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200234 Decimal expansion of greatest x satisfying 3*x^2 - 2*cos(x) = 3*sin(x).
 * Equation; 3*x^2-2*cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A200234 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A200234() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.TWO.multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.070), CR.valueOf(1.114)).execute(CR.ZERO));
  }
}
