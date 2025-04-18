package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198219 Decimal expansion of greatest x having 3*x^2+x=3*cos(x).
 * Equation; 3*x^2+x-(3*cos(x))
 * @author Georg Fischer
 */
public class A198219 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198219() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(x).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(0.703), CR.valueOf(0.732)).execute(CR.ZERO));
  }
}
