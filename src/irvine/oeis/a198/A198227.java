package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198227 Decimal expansion of least x having 3*x^2+2x=3*cos(x). Decimal expansion of greatest x having 3*x^2+2x=3*cos(x).
 * Equation; 3*x^2+2x-(3*cos(x))
 * @author Georg Fischer
 */
public class A198227 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198227() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(CR.TWO.multiply(x)).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(0.614), CR.valueOf(0.639)).execute(CR.ZERO));
  }
}
