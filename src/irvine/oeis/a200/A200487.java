package irvine.oeis.a200;
// Generated by gen_seq4.pl decsolvr at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200487 Decimal expansion of least x&gt;0 satisfying x^2-3x+3=tan(x).
 * Equation; x^2-3x+3-(tan(x))
 * @author Georg Fischer
 */
public class A200487 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A200487() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(CR.THREE.multiply(x)).add(CR.THREE).subtract(REALS.tan(x));
      }
    }.inverseMonotone(CR.valueOf(0.842), CR.valueOf(0.877)).execute(CR.ZERO));
  }
}
