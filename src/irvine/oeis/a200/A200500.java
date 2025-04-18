package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200500 Decimal expansion of least x&gt;0 satisfying 2*x^2-3*x+2=tan(x).
 * Equation; 2*x^2-3*x+2-(tan(x))
 * @author Georg Fischer
 */
public class A200500 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200500() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.THREE.multiply(x)).add(CR.TWO).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(0.705), CR.valueOf(0.734)).execute(CR.ZERO));
  }
}
