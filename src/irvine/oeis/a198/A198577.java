package irvine.oeis.a198;
// Generated by gen_seq4.pl decsolv at 2021-08-01 19:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198577 Decimal expansion of x &gt; 0 satisfying 2*x^2-4*x = sin(x).
 * Equation; 2*x^2-4*x-sin(x)
 * @author Georg Fischer
 */
public class A198577 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198577() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.FOUR.multiply(x)).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(2.142), CR.valueOf(2.230)).execute(CR.ZERO));
  }
}
