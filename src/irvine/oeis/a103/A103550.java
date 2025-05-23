package irvine.oeis.a103;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A103550 Decimal expansion of solution to x*5^x=1.
 * Equation; x*5^x-(1)
 * @author Georg Fischer
 */
public class A103550 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A103550() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(CR.FIVE.pow(x)).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.460), CR.valueOf(0.479)).execute(CR.ZERO));
  }
}
