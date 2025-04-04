package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200591 Decimal expansion of least x&gt;0 satisfying 3*x^2-2*x+3=tan(x).
 * Equation; 3*x^2-2*x+3-(tan(x))
 * @author Georg Fischer
 */
public class A200591 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200591() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.TWO.multiply(x)).add(CR.THREE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(1.381), CR.valueOf(1.437)).execute(CR.ZERO));
  }
}
