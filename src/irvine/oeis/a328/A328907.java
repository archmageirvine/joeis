package irvine.oeis.a328;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A328907 Decimal expansion of the solution x = 0.6009668516... to 1 + 3^x = 6^x.
 * Equation; 1+3^x-6^x
 * @author Georg Fischer
 */
public class A328907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A328907() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.ONE.add(CR.THREE.pow(x)).subtract(CR.SIX.pow(x));
      }
    }.inverseMonotone(CR.valueOf(0.589), CR.valueOf(0.613)).execute(CR.ZERO));
  }
}
