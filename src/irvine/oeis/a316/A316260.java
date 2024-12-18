package irvine.oeis.a316;
// Generated by gen_seq4.pl decsolvn at 2021-08-10 17:35

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A316260 Decimal expansion of the greatest x such that 1/x + 1/(x+3) + 1/(x+4) = 3.
 * Equation; 3*x^3+18*x^2+22*x-12
 * @author Georg Fischer
 */
public class A316260 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A316260() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.pow(3)).add(CR.valueOf(18).multiply(x.pow(CR.TWO))).add(CR.valueOf(22).multiply(x)).subtract(CR.valueOf(12));
      }
    }.inverseMonotone(CR.valueOf(0.395), CR.valueOf(0.411)).execute(CR.ZERO));
  }
}
